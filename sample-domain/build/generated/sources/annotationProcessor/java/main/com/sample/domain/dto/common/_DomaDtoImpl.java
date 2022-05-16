package com.sample.domain.dto.common;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:37.994+0900")
public final class _DomaDtoImpl extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.domain.dto.common.DomaDtoImpl> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _DomaDtoImpl __singleton = new _DomaDtoImpl();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the createdBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, java.lang.String, Object> $createdBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.common.DomaDtoImpl.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "createdBy", "", __namingType, true, true, false);

    /** the createdAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, java.time.LocalDateTime, Object> $createdAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.common.DomaDtoImpl.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "createdAt", "", __namingType, true, true, false);

    /** the updatedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, java.lang.String, Object> $updatedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.common.DomaDtoImpl.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "updatedBy", "", __namingType, true, true, false);

    /** the updatedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, java.time.LocalDateTime, Object> $updatedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.common.DomaDtoImpl.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "updatedAt", "", __namingType, true, true, false);

    /** the deletedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, java.lang.String, Object> $deletedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.common.DomaDtoImpl.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "deletedBy", "", __namingType, true, true, false);

    /** the deletedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, java.time.LocalDateTime, Object> $deletedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.common.DomaDtoImpl.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "deletedAt", "", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(com.sample.domain.dto.common.DomaDtoImpl.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "version", __namingType, false);

    private final java.util.function.Supplier<com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.common.DomaDtoImpl>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> __entityPropertyTypeMap;

    private _DomaDtoImpl() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "DomaDtoImpl";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> __list = new java.util.ArrayList<>(7);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> __map = new java.util.HashMap<>(7);
        __list.add($createdBy);
        __map.put("createdBy", $createdBy);
        __list.add($createdAt);
        __map.put("createdAt", $createdAt);
        __list.add($updatedBy);
        __map.put("updatedBy", $updatedBy);
        __list.add($updatedAt);
        __map.put("updatedAt", $updatedAt);
        __list.add($deletedBy);
        __map.put("deletedBy", $deletedBy);
        __list.add($deletedAt);
        __map.put("deletedAt", $deletedAt);
        __list.add($version);
        __map.put("version", $version);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.sample.domain.dto.common.DomaDtoImpl entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.domain.dto.common.DomaDtoImpl> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.domain.dto.common.DomaDtoImpl entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.domain.dto.common.DomaDtoImpl> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.domain.dto.common.DomaDtoImpl entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.domain.dto.common.DomaDtoImpl> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.domain.dto.common.DomaDtoImpl entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.domain.dto.common.DomaDtoImpl> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.domain.dto.common.DomaDtoImpl entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.domain.dto.common.DomaDtoImpl> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.domain.dto.common.DomaDtoImpl entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.domain.dto.common.DomaDtoImpl> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.common.DomaDtoImpl, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.common.DomaDtoImpl, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public com.sample.domain.dto.common.DomaDtoImpl newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.domain.dto.common.DomaDtoImpl, ?>> __args) {
        return null;
    }

    @Override
    public Class<com.sample.domain.dto.common.DomaDtoImpl> getEntityClass() {
        return com.sample.domain.dto.common.DomaDtoImpl.class;
    }

    @Override
    public com.sample.domain.dto.common.DomaDtoImpl getOriginalStates(com.sample.domain.dto.common.DomaDtoImpl __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.sample.domain.dto.common.DomaDtoImpl __entity) {
    }

    /**
     * @return the singleton
     */
    public static _DomaDtoImpl getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _DomaDtoImpl newInstance() {
        return new _DomaDtoImpl();
    }

    private static class ListenerHolder {
        private static com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.common.DomaDtoImpl> listener = new com.sample.domain.dao.DefaultEntityListener<>();
    }

}
