package com.sample.domain.dto.system;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:37.962+0900")
public final class _Staff extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.domain.dto.system.Staff> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _Staff __singleton = new _Staff();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<com.sample.domain.dto.system.Staff> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(com.sample.domain.dto.system.Staff.class, "originalStates");

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the createdBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $createdBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "createdBy", "", __namingType, true, true, false);

    /** the createdAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.time.LocalDateTime, Object> $createdAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "createdAt", "", __namingType, true, true, false);

    /** the updatedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $updatedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "updatedBy", "", __namingType, true, true, false);

    /** the updatedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.time.LocalDateTime, Object> $updatedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "updatedAt", "", __namingType, true, true, false);

    /** the deletedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $deletedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "deletedBy", "", __namingType, true, true, false);

    /** the deletedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.time.LocalDateTime, Object> $deletedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "deletedAt", "", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(com.sample.domain.dto.system.Staff.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "version", __namingType, false);

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.Long, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "id", "staff_id", __namingType, false, __idGenerator);

    /** the password */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $password = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "password", "", __namingType, true, true, false);

    /** the firstName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $firstName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "firstName", "", __namingType, true, true, false);

    /** the lastName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $lastName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "lastName", "", __namingType, true, true, false);

    /** the email */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $email = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "email", "", __namingType, true, true, false);

    /** the tel */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $tel = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "tel", "", __namingType, true, true, false);

    /** the passwordResetToken */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.lang.String, Object> $passwordResetToken = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "passwordResetToken", "", __namingType, true, true, false);

    /** the tokenExpiresAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, java.time.LocalDateTime, Object> $tokenExpiresAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.Staff.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "tokenExpiresAt", "", __namingType, true, true, false);

    private final java.util.function.Supplier<com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.system.Staff>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> __entityPropertyTypeMap;

    private _Staff() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Staff";
        __catalogName = "";
        __schemaName = "";
        __tableName = "staffs";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> __list = new java.util.ArrayList<>(15);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> __map = new java.util.HashMap<>(15);
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
        __list.add($password);
        __map.put("password", $password);
        __list.add($firstName);
        __map.put("firstName", $firstName);
        __list.add($lastName);
        __map.put("lastName", $lastName);
        __list.add($email);
        __map.put("email", $email);
        __list.add($tel);
        __map.put("tel", $tel);
        __list.add($passwordResetToken);
        __map.put("passwordResetToken", $passwordResetToken);
        __list.add($tokenExpiresAt);
        __map.put("tokenExpiresAt", $tokenExpiresAt);
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
    public void preInsert(com.sample.domain.dto.system.Staff entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.domain.dto.system.Staff> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.domain.dto.system.Staff entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.domain.dto.system.Staff> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.domain.dto.system.Staff entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.domain.dto.system.Staff> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.domain.dto.system.Staff entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.domain.dto.system.Staff> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.domain.dto.system.Staff entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.domain.dto.system.Staff> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.domain.dto.system.Staff entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.domain.dto.system.Staff> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.Staff, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.system.Staff, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public com.sample.domain.dto.system.Staff newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.domain.dto.system.Staff, ?>> __args) {
        com.sample.domain.dto.system.Staff entity = new com.sample.domain.dto.system.Staff();
        if (__args.get("createdBy") != null) __args.get("createdBy").save(entity);
        if (__args.get("createdAt") != null) __args.get("createdAt").save(entity);
        if (__args.get("updatedBy") != null) __args.get("updatedBy").save(entity);
        if (__args.get("updatedAt") != null) __args.get("updatedAt").save(entity);
        if (__args.get("deletedBy") != null) __args.get("deletedBy").save(entity);
        if (__args.get("deletedAt") != null) __args.get("deletedAt").save(entity);
        if (__args.get("version") != null) __args.get("version").save(entity);
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("password") != null) __args.get("password").save(entity);
        if (__args.get("firstName") != null) __args.get("firstName").save(entity);
        if (__args.get("lastName") != null) __args.get("lastName").save(entity);
        if (__args.get("email") != null) __args.get("email").save(entity);
        if (__args.get("tel") != null) __args.get("tel").save(entity);
        if (__args.get("passwordResetToken") != null) __args.get("passwordResetToken").save(entity);
        if (__args.get("tokenExpiresAt") != null) __args.get("tokenExpiresAt").save(entity);
        return entity;
    }

    @Override
    public Class<com.sample.domain.dto.system.Staff> getEntityClass() {
        return com.sample.domain.dto.system.Staff.class;
    }

    @Override
    public com.sample.domain.dto.system.Staff getOriginalStates(com.sample.domain.dto.system.Staff __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(com.sample.domain.dto.system.Staff __entity) {
        com.sample.domain.dto.system.Staff __currentStates = new com.sample.domain.dto.system.Staff();
        $createdBy.copy(__currentStates, __entity);
        $createdAt.copy(__currentStates, __entity);
        $updatedBy.copy(__currentStates, __entity);
        $updatedAt.copy(__currentStates, __entity);
        $deletedBy.copy(__currentStates, __entity);
        $deletedAt.copy(__currentStates, __entity);
        $version.copy(__currentStates, __entity);
        $id.copy(__currentStates, __entity);
        $password.copy(__currentStates, __entity);
        $firstName.copy(__currentStates, __entity);
        $lastName.copy(__currentStates, __entity);
        $email.copy(__currentStates, __entity);
        $tel.copy(__currentStates, __entity);
        $passwordResetToken.copy(__currentStates, __entity);
        $tokenExpiresAt.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _Staff getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Staff newInstance() {
        return new _Staff();
    }

    private static class ListenerHolder {
        private static com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.system.Staff> listener = new com.sample.domain.dao.DefaultEntityListener<>();
    }

}
