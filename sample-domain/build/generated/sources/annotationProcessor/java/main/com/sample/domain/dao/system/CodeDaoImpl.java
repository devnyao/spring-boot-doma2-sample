package com.sample.domain.dao.system;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:38.346+0900")
public class CodeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.domain.dao.system.CodeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "selectAll", com.sample.domain.dto.system.CodeCriteria.class, org.seasar.doma.jdbc.SelectOptions.class, java.util.stream.Collector.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "selectById", java.lang.Long.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "selectByKey", java.lang.String.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "select", com.sample.domain.dto.system.CodeCriteria.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "insert", com.sample.domain.dto.system.Code.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "update", com.sample.domain.dto.system.Code.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "delete", com.sample.domain.dto.system.Code.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.CodeDao.class, "insert", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public CodeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public <R> R selectAll(com.sample.domain.dto.system.CodeCriteria criteria, org.seasar.doma.jdbc.SelectOptions options, java.util.stream.Collector<com.sample.domain.dto.system.Code, ?, R> collector) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "selectAll", criteria, options, collector);
        try {
            if (criteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("criteria");
            }
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            if (collector == null) {
                throw new org.seasar.doma.DomaNullPointerException("collector");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/CodeDao/selectAll.sql");
            __query.setOptions(options);
            __query.setEntityType(com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.CodeCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityCollectorHandler<com.sample.domain.dto.system.Code, R>(com.sample.domain.dto.system._Code.getSingletonInternal(), collector));
            R __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.Code> selectById(java.lang.Long id) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/CodeDao/selectById.sql");
            __query.setEntityType(com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.addParameter("id", java.lang.Long.class, id);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.Code>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.Code>(com.sample.domain.dto.system._Code.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.Code> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.Code> selectByKey(java.lang.String codeKey) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "selectByKey", codeKey);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/CodeDao/selectByKey.sql");
            __query.setEntityType(com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.addParameter("codeKey", java.lang.String.class, codeKey);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("selectByKey");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.Code>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.Code>(com.sample.domain.dto.system._Code.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.Code> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "selectByKey", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "selectByKey", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.Code> select(com.sample.domain.dto.system.CodeCriteria criteria) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "select", criteria);
        try {
            if (criteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("criteria");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/CodeDao/select.sql");
            __query.setEntityType(com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.CodeCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("select");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.Code>> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.Code>(com.sample.domain.dto.system._Code.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.Code> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "select", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "select", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.sample.domain.dto.system.Code Code) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "insert", Code);
        try {
            if (Code == null) {
                throw new org.seasar.doma.DomaNullPointerException("Code");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.sample.domain.dto.system.Code> __query = getQueryImplementors().createAutoInsertQuery(__method4, com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(Code);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.sample.domain.dto.system.Code code) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "update", code);
        try {
            if (code == null) {
                throw new org.seasar.doma.DomaNullPointerException("code");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.Code> __query = getQueryImplementors().createAutoUpdateQuery(__method5, com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(code);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames("categoryKey", "categoryName", "codeKey", "codeAlias", "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "attribute6", "isInvalid");
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(com.sample.domain.dto.system.Code code) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "delete", code);
        try {
            if (code == null) {
                throw new org.seasar.doma.DomaNullPointerException("code");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.Code> __query = getQueryImplementors().createAutoUpdateQuery(__method6, com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntity(code);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(true);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method6, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<com.sample.domain.dto.system.Code> codes) {
        entering("com.sample.domain.dao.system.CodeDaoImpl", "insert", codes);
        try {
            if (codes == null) {
                throw new org.seasar.doma.DomaNullPointerException("codes");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<com.sample.domain.dto.system.Code> __query = getQueryImplementors().createAutoBatchInsertQuery(__method7, com.sample.domain.dto.system._Code.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setEntities(codes);
            __query.setCallerClassName("com.sample.domain.dao.system.CodeDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method7, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.CodeDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.CodeDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
