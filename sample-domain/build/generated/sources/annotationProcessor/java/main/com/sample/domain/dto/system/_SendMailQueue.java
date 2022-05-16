package com.sample.domain.dto.system;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:37.910+0900")
public final class _SendMailQueue extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.domain.dto.system.SendMailQueue> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _SendMailQueue __singleton = new _SendMailQueue();

    private static final org.seasar.doma.jdbc.entity.OriginalStatesAccessor<com.sample.domain.dto.system.SendMailQueue> __originalStatesAccessor = new org.seasar.doma.jdbc.entity.OriginalStatesAccessor<>(com.sample.domain.dto.system.SendMailQueue.class, "originalStates");

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the createdBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, Object> $createdBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "createdBy", "", __namingType, true, true, false);

    /** the createdAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.time.LocalDateTime, Object> $createdAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "createdAt", "", __namingType, true, true, false);

    /** the updatedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, Object> $updatedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "updatedBy", "", __namingType, true, true, false);

    /** the updatedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.time.LocalDateTime, Object> $updatedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "updatedAt", "", __namingType, true, true, false);

    /** the deletedBy */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, Object> $deletedBy = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "deletedBy", "", __namingType, true, true, false);

    /** the deletedAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.time.LocalDateTime, Object> $deletedAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "deletedAt", "", __namingType, true, true, false);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.Integer, Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class,  java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "version", "version", __namingType, false);

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.Long, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.lang.Long.class, java.lang.Long.class, () -> new org.seasar.doma.wrapper.LongWrapper(), null, null, "id", "send_mail_queue_id", __namingType, false, __idGenerator);

    /** the from */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, Object> $from = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "from", "from_address", __namingType, true, true, false);

    /** the to */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, com.sample.domain.dto.common.CommaSeparatedString> $to = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, com.sample.domain.dto.common.CommaSeparatedString.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, com.sample.domain.dto.common._CommaSeparatedString.getSingletonInternal(), "to", "to_address", __namingType, true, true, false);

    /** the cc */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, com.sample.domain.dto.common.CommaSeparatedString> $cc = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, com.sample.domain.dto.common.CommaSeparatedString.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, com.sample.domain.dto.common._CommaSeparatedString.getSingletonInternal(), "cc", "cc_address", __namingType, true, true, false);

    /** the bcc */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, com.sample.domain.dto.common.CommaSeparatedString> $bcc = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, com.sample.domain.dto.common.CommaSeparatedString.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, com.sample.domain.dto.common._CommaSeparatedString.getSingletonInternal(), "bcc", "bcc_address", __namingType, true, true, false);

    /** the sentAt */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.time.LocalDateTime, Object> $sentAt = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, () -> new org.seasar.doma.wrapper.LocalDateTimeWrapper(), null, null, "sentAt", "", __namingType, true, true, false);

    /** the subject */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, Object> $subject = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "subject", "", __namingType, true, true, false);

    /** the body */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, java.lang.String, Object> $body = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.sample.domain.dto.system.SendMailQueue.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "body", "", __namingType, true, true, false);

    private final java.util.function.Supplier<com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.system.SendMailQueue>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> __entityPropertyTypeMap;

    private _SendMailQueue() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "SendMailQueue";
        __catalogName = "";
        __schemaName = "";
        __tableName = "send_mail_queue";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> __list = new java.util.ArrayList<>(15);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> __map = new java.util.HashMap<>(15);
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
        __list.add($from);
        __map.put("from", $from);
        __list.add($to);
        __map.put("to", $to);
        __list.add($cc);
        __map.put("cc", $cc);
        __list.add($bcc);
        __map.put("bcc", $bcc);
        __list.add($sentAt);
        __map.put("sentAt", $sentAt);
        __list.add($subject);
        __map.put("subject", $subject);
        __list.add($body);
        __map.put("body", $body);
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
    public void preInsert(com.sample.domain.dto.system.SendMailQueue entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.domain.dto.system.SendMailQueue> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.domain.dto.system.SendMailQueue entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.domain.dto.system.SendMailQueue> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.domain.dto.system.SendMailQueue entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.domain.dto.system.SendMailQueue> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.domain.dto.system.SendMailQueue entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.domain.dto.system.SendMailQueue> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.domain.dto.system.SendMailQueue entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.domain.dto.system.SendMailQueue> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.domain.dto.system.SendMailQueue entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.domain.dto.system.SendMailQueue> context) {
        Class __listenerClass = com.sample.domain.dao.DefaultEntityListener.class;
        com.sample.domain.dao.DefaultEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.domain.dto.system.SendMailQueue, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.sample.domain.dto.system.SendMailQueue, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public com.sample.domain.dto.system.SendMailQueue newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.domain.dto.system.SendMailQueue, ?>> __args) {
        com.sample.domain.dto.system.SendMailQueue entity = new com.sample.domain.dto.system.SendMailQueue();
        if (__args.get("createdBy") != null) __args.get("createdBy").save(entity);
        if (__args.get("createdAt") != null) __args.get("createdAt").save(entity);
        if (__args.get("updatedBy") != null) __args.get("updatedBy").save(entity);
        if (__args.get("updatedAt") != null) __args.get("updatedAt").save(entity);
        if (__args.get("deletedBy") != null) __args.get("deletedBy").save(entity);
        if (__args.get("deletedAt") != null) __args.get("deletedAt").save(entity);
        if (__args.get("version") != null) __args.get("version").save(entity);
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("from") != null) __args.get("from").save(entity);
        if (__args.get("to") != null) __args.get("to").save(entity);
        if (__args.get("cc") != null) __args.get("cc").save(entity);
        if (__args.get("bcc") != null) __args.get("bcc").save(entity);
        if (__args.get("sentAt") != null) __args.get("sentAt").save(entity);
        if (__args.get("subject") != null) __args.get("subject").save(entity);
        if (__args.get("body") != null) __args.get("body").save(entity);
        return entity;
    }

    @Override
    public Class<com.sample.domain.dto.system.SendMailQueue> getEntityClass() {
        return com.sample.domain.dto.system.SendMailQueue.class;
    }

    @Override
    public com.sample.domain.dto.system.SendMailQueue getOriginalStates(com.sample.domain.dto.system.SendMailQueue __entity) {
        return __originalStatesAccessor.get(__entity);
    }

    @Override
    public void saveCurrentStates(com.sample.domain.dto.system.SendMailQueue __entity) {
        com.sample.domain.dto.system.SendMailQueue __currentStates = new com.sample.domain.dto.system.SendMailQueue();
        $createdBy.copy(__currentStates, __entity);
        $createdAt.copy(__currentStates, __entity);
        $updatedBy.copy(__currentStates, __entity);
        $updatedAt.copy(__currentStates, __entity);
        $deletedBy.copy(__currentStates, __entity);
        $deletedAt.copy(__currentStates, __entity);
        $version.copy(__currentStates, __entity);
        $id.copy(__currentStates, __entity);
        $from.copy(__currentStates, __entity);
        $to.copy(__currentStates, __entity);
        $cc.copy(__currentStates, __entity);
        $bcc.copy(__currentStates, __entity);
        $sentAt.copy(__currentStates, __entity);
        $subject.copy(__currentStates, __entity);
        $body.copy(__currentStates, __entity);
        __originalStatesAccessor.set(__entity, __currentStates);
    }

    /**
     * @return the singleton
     */
    public static _SendMailQueue getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SendMailQueue newInstance() {
        return new _SendMailQueue();
    }

    private static class ListenerHolder {
        private static com.sample.domain.dao.DefaultEntityListener<com.sample.domain.dto.system.SendMailQueue> listener = new com.sample.domain.dao.DefaultEntityListener<>();
    }

}
