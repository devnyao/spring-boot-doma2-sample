package com.sample.domain.dto.common;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:37.796+0900")
public final class _CommaSeparatedString extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, com.sample.domain.dto.common.CommaSeparatedString> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _CommaSeparatedString singleton = new _CommaSeparatedString();

    private _CommaSeparatedString() {
        super(() -> new org.seasar.doma.wrapper.StringWrapper());
    }

    @Override
    protected com.sample.domain.dto.common.CommaSeparatedString newDomain(java.lang.String value) {
        if (value == null) {
            return null;
        }
        return com.sample.domain.dto.common.CommaSeparatedString.of(value);
    }

    @Override
    protected java.lang.String getBasicValue(com.sample.domain.dto.common.CommaSeparatedString domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.String.class;
    }

    @Override
    public Class<com.sample.domain.dto.common.CommaSeparatedString> getDomainClass() {
        return com.sample.domain.dto.common.CommaSeparatedString.class;
    }

    /**
     * @return the singleton
     */
    public static _CommaSeparatedString getSingletonInternal() {
        return singleton;
    }

}
