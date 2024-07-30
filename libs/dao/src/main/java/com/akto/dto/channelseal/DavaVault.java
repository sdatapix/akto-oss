package com.akto.dto.channelseal;

import org.bson.codecs.pojo.annotations.BsonId;

public class DavaVault {

    @BsonId
    int id;
	String sensitiveInfoType;
	String value;
	String token;
}
