/*
 * Copyright 2010-2013, the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kovitad.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author <a href="mailto:cleclerc@cloudbees.com">Cyrille Le Clerc</a>
 */
@JsonIgnoreProperties({"image","imageSrc"})
@Entity
@XmlRootElement
public class Product {
	private static final Logger logger = Logger.getLogger(Product.class);
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	
	@XmlTransient
	@Lob
	@Column(name = "PRODUCT_IMAGE", nullable = true, columnDefinition = "mediumblob")
	private byte[] image;
	
	private String imageType;
	
	private String imageUrl;
	
	private String imageCreditsUrl;

	
	public Product() {
	}

	public Product(String name, String imageUrl, String imageCreditsUrl) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.imageCreditsUrl = imageCreditsUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageCreditsUrl() {
		return imageCreditsUrl;
	}

	public void setImageCreditsUrl(String imageCreditsUrl) {
		this.imageCreditsUrl = imageCreditsUrl;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Product))
			return false;

		Product product = (Product) o;

		if (id != null ? !id.equals(product.id) : product.id != null)
			return false;

		return true;
	}
	
	@Transient
	public String getImageSrc() {
		
		StringBuilder prefix = new StringBuilder("data:");
		if(StringUtils.isNotBlank(this.imageType)){
			prefix.append(this.imageType);
			prefix.append(";base64,");
			
				//String encodeArrayString = encodeArray(this.image);
				prefix.append(new String(this.image));
			
			logger.info(prefix.toString());
		}
		
		return prefix.toString();
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Product{" + "id=" + id + ", name='" + name + '\'' + '}';
	}
}
