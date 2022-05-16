package com.sample.domain.dto.common;

/**
 * @param <T> T
 */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:37.782+0900")
public final class _ID<T> extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, com.sample.domain.dto.common.ID<T>> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    @SuppressWarnings("rawtypes")
    private static final _ID singleton = new _ID();

    private _ID() {
        super(() -> new org.seasar.doma.wrapper.IntegerWrapper());
    }

    @Override
    protected com.sample.domain.dto.common.ID<T> newDomain(java.lang.Integer value) {
        if (value == null) {
            return null;
        }
        return com.sample.domain.dto.common.ID.of(value);
    }

    @Override
    protected java.lang.Integer getBasicValue(com.sample.domain.dto.common.ID<T> domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.Integer.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<com.sample.domain.dto.common.ID<T>> getDomainClass() {
        Class<?> clazz = com.sample.domain.dto.common.ID.class;
        return (Class<com.sample.domain.dto.common.ID<T>>) clazz;
    }

    /**
     * @return the singleton
     */
    @SuppressWarnings("unchecked")
    public static <T> _ID<T> getSingletonInternal() {
        return (_ID<T>) singleton;
    }

}
