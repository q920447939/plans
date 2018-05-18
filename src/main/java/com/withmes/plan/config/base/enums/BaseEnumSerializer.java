package com.withmes.plan.config.base.enums;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author guocp
 * @desc 枚举序列化
 * @date 2015/7/21 17:53
 */
public class BaseEnumSerializer extends JsonSerializer<BaseEnum> {


	@Override
	@SuppressWarnings("all")
	public void serialize(BaseEnum viewEnum, JsonGenerator jsonGenerator, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("code");
        jsonGenerator.writeObject(viewEnum.getCode());
        jsonGenerator.writeFieldName("desc");
        jsonGenerator.writeString(viewEnum.getDesc());
        jsonGenerator.writeEndObject();
	}
}
