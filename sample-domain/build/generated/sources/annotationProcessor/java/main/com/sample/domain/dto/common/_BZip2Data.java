package com.sample.domain.dto.common;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:37.790+0900")
public final class _BZip2Data extends org.seasar.doma.jdbc.domain.AbstractDomainType<byte[], com.sample.domain.dto.common.BZip2Data> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _BZip2Data singleton = new _BZip2Data();

    private _BZip2Data() {
        super(() -> new org.seasar.doma.wrapper.BytesWrapper());
    }

    @Override
    protected com.sample.domain.dto.common.BZip2Data newDomain(byte[] value) {
        if (value == null) {
            return null;
        }
        return new com.sample.domain.dto.common.BZip2Data(value);
    }

    @Override
    protected byte[] getBasicValue(com.sample.domain.dto.common.BZip2Data domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return byte[].class;
    }

    @Override
    public Class<com.sample.domain.dto.common.BZip2Data> getDomainClass() {
        return com.sample.domain.dto.common.BZip2Data.class;
    }

    /**
     * @return the singleton
     */
    public static _BZip2Data getSingletonInternal() {
        return singleton;
    }

}
