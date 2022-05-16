package com.sample.domain.dto.system;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:37.970+0900")
public final class _Code extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.domain.dto.system.Code> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _Code __singleton = new _Code();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the createdBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $createdBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "createdBy", "", __namingType, true, true, false);

    /** the createdAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.time.LocalDateTime, Object> $createdAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "createdAt", "", __namingType, true, true, false);

    /** the updatedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $updatedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "updatedBy", "", __namingType, true, true, false);

    /** the updatedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.time.LocalDateTime, Object> $updatedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "updatedAt", "", __namingType, true, true, false);

    /** the deletedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $deletedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "deletedBy", "", __namingType, true, true, false);

    /** the deletedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.time.LocalDateTime, Object> $deletedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "deletedAt", "", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(com.sample.domain.dto.system.Code.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "version", __namingType, false);

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.Long, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "id", "code_id", __namingType, false, __idGenerator);

    /** the categoryKey */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $categoryKey = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "categoryKey", "", __namingType, true, true, false);

    /** the categoryName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $categoryName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "categoryName", "", __namingType, true, true, false);

    /** the codeKey */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $codeKey = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "codeKey", "", __namingType, true, true, false);

    /** the codeValue */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $codeValue = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "codeValue", "", __namingType, true, true, false);

    /** the codeAlias */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $codeAlias = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "codeAlias", "", __namingType, true, true, false);

    /** the attribute1 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $attribute1 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "attribute1", "", __namingType, true, true, false);

    /** the attribute2 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $attribute2 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "attribute2", "", __namingType, true, true, false);

    /** the attribute3 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $attribute3 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "attribute3", "", __namingType, true, true, false);

    /** the attribute4 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $attribute4 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "attribute4", "", __namingType, true, true, false);

    /** the attribute5 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $attribute5 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "attribute5", "", __namingType, true, true, false);

    /** the attribute6 */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.String, Object> $attribute6 = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "attribute6", "", __namingType, true, true, false);

    /** the displayOrder */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.Integer, Object> $displayOrder = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "displayOrder", "", __namingType, true, true, false);

    /** the isInvalid */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, java.lang.Boolean, Object> $isInvalid = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Code.class, java.lang.Boolean.class, java.lang.Boolean.class, () -> new org.seasar.doma.wrapper.BooleanWrapper(), null, null, "isInvalid", "", __namingType, true, true, false);

    private final java.util.function.Supplier<com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.system.Code>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> __entityPropertyTypeMap;

    private _Code() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Code";
        __catalogName = "";
        __schemaName = "";
        __tableName = "code";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> __list = new java.util.ArrayList<>(21);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> __map = new java.util.HashMap<>(21);
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
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($categoryKey);
        __map.put("categoryKey", $categoryKey);
        __list.add($categoryName);
        __map.put("categoryName", $categoryName);
        __list.add($codeKey);
        __map.put("codeKey", $codeKey);
        __list.add($codeValue);
        __map.put("codeValue", $codeValue);
        __list.add($codeAlias);
        __map.put("codeAlias", $codeAlias);
        __list.add($attribute1);
        __map.put("attribute1", $attribute1);
        __list.add($attribute2);
        __map.put("attribute2", $attribute2);
        __list.add($attribute3);
        __map.put("attribute3", $attribute3);
        __list.add($attribute4);
        __map.put("attribute4", $attribute4);
        __list.add($attribute5);
        __map.put("attribute5", $attribute5);
        __list.add($attribute6);
        __map.put("attribute6", $attribute6);
        __list.add($displayOrder);
        __map.put("displayOrder", $displayOrder);
        __list.add($isInvalid);
        __map.put("isInvalid", $isInvalid);
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
    public void preInsert(com.sample.domain.dto.system.Code entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.domain.dto.system.Code> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.domain.dto.system.Code entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.domain.dto.system.Code> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.domain.dto.system.Code entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.domain.dto.system.Code> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.domain.dto.system.Code entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.domain.dto.system.Code> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.domain.dto.system.Code entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.domain.dto.system.Code> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.domain.dto.system.Code entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.domain.dto.system.Code> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Code, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.system.Code, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public com.sample.domain.dto.system.Code newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.domain.dto.system.Code, ?>> __args) {
        com.sample.domain.dto.system.Code entity = new com.sample.domain.dto.system.Code();
        if (__args.get("createdBy") != null) __args.get("createdBy").save(entity);
        if (__args.get("createdAt") != null) __args.get("createdAt").save(entity);
        if (__args.get("updatedBy") != null) __args.get("updatedBy").save(entity);
        if (__args.get("updatedAt") != null) __args.get("updatedAt").save(entity);
        if (__args.get("deletedBy") != null) __args.get("deletedBy").save(entity);
        if (__args.get("deletedAt") != null) __args.get("deletedAt").save(entity);
        if (__args.get("version") != null) __args.get("version").save(entity);
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("categoryKey") != null) __args.get("categoryKey").save(entity);
        if (__args.get("categoryName") != null) __args.get("categoryName").save(entity);
        if (__args.get("codeKey") != null) __args.get("codeKey").save(entity);
        if (__args.get("codeValue") != null) __args.get("codeValue").save(entity);
        if (__args.get("codeAlias") != null) __args.get("codeAlias").save(entity);
        if (__args.get("attribute1") != null) __args.get("attribute1").save(entity);
        if (__args.get("attribute2") != null) __args.get("attribute2").save(entity);
        if (__args.get("attribute3") != null) __args.get("attribute3").save(entity);
        if (__args.get("attribute4") != null) __args.get("attribute4").save(entity);
        if (__args.get("attribute5") != null) __args.get("attribute5").save(entity);
        if (__args.get("attribute6") != null) __args.get("attribute6").save(entity);
        if (__args.get("displayOrder") != null) __args.get("displayOrder").save(entity);
        if (__args.get("isInvalid") != null) __args.get("isInvalid").save(entity);
        return entity;
    }

    @Override
    public Class<com.sample.domain.dto.system.Code> getEntityClass() {
        return com.sample.domain.dto.system.Code.class;
    }

    @Override
    public com.sample.domain.dto.system.Code getOriginalStates(com.sample.domain.dto.system.Code __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.sample.domain.dto.system.Code __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Code getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Code newInstance() {
        return new _Code();
    }

    private static class ListenerHolder {
        private static com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.system.Code> listener = new com.sample.domain.dao.DefaultEntityListener<>();
    }

}
