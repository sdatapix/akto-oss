package com.akto.dto.channelseal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.codecs.pojo.annotations.BsonId;

public class SensitiveDataElement {

    @BsonId
    int id;
    String propertyName;
    // If we discover these by vault match, we need to track hit rate,
    // which means we have to track elements that don't match
    // First time seen,save element that may have no SIT
	String sensitiveInfoType;
    String endpoint;
    String contentType;
    // may need fully qualified path to distinguish dups
    String location;
    String direction;    

    public SensitiveDataElement() {
    }

    public SensitiveDataElement(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getSensitiveInfoType() {
		return sensitiveInfoType;
	}

	public void setSensitiveInfoType(String sensitiveInfoType) {
		this.sensitiveInfoType = sensitiveInfoType;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public SensitiveDataElement id(int id) {
        setId(id);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            "}";
    }

}
