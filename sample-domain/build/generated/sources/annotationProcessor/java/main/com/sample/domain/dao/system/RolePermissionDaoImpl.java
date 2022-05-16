package com.sample.domain.dao.system;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:38.166+0900")
public class RolePermissionDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.domain.dao.system.RolePermissionDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "selectAll", com.sample.domain.dto.system.RolePermissionCriteria.class, org.seasar.doma.jdbc.SelectOptions.class, java.util.stream.Collector.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "selectById", java.lang.Long.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "select", com.sample.domain.dto.system.RolePermissionCriteria.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "insert", com.sample.domain.dto.system.RolePermission.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "update", com.sample.domain.dto.system.RolePermission.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "delete", com.sample.domain.dto.system.RolePermission.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "delete", java.util.List.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.RolePermissionDao.class, "insert", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public RolePermissionDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public <R> R selectAll(com.sample.domain.dto.system.RolePermissionCriteria criteria, org.seasar.doma.jdbc.SelectOptions options, java.util.stream.Collector<com.sample.domain.dto.system.RolePermission, ?, R> collector) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "selectAll", criteria, options, collector);
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
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/RolePermissionDao/selectAll.sql");
            __query.setOptions(options);
            __query.setEntityType(com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.RolePermissionCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityCollectorHandler<com.sample.domain.dto.system.RolePermission, R>(com.sample.domain.dto.system._RolePermission.getSingletonInternal(), collector));
            R __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.RolePermission> selectById(java.lang.Long id) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/RolePermissionDao/selectById.sql");
            __query.setEntityType(com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.addParameter("id", java.lang.Long.class, id);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.RolePermission>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.RolePermission>(com.sample.domain.dto.system._RolePermission.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.RolePermission> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.RolePermission> select(com.sample.domain.dto.system.RolePermissionCriteria criteria) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "select", criteria);
        try {
            if (criteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("criteria");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/RolePermissionDao/select.sql");
            __query.setEntityType(com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.RolePermissionCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
            __query.setCallerMethodName("select");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.RolePermission>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.RolePermission>(com.sample.domain.dto.system._RolePermission.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.RolePermission> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "select", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "select", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.sample.domain.dto.system.RolePermission rolePermission) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "insert", rolePermission);
        try {
            if (rolePermission == null) {
                throw new org.seasar.doma.DomaNullPointerException("rolePermission");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.sample.domain.dto.system.RolePermission> __query = getQueryImplementors().createAutoInsertQuery(__method3, com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(rolePermission);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.sample.domain.dto.system.RolePermission rolePermission) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "update", rolePermission);
        try {
            if (rolePermission == null) {
                throw new org.seasar.doma.DomaNullPointerException("rolePermission");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.RolePermission> __query = getQueryImplementors().createAutoUpdateQuery(__method4, com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(rolePermission);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(com.sample.domain.dto.system.RolePermission rolePermission) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "delete", rolePermission);
        try {
            if (rolePermission == null) {
                throw new org.seasar.doma.DomaNullPointerException("rolePermission");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.RolePermission> __query = getQueryImplementors().createAutoUpdateQuery(__method5, com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(rolePermission);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
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
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] delete(java.util.List<com.sample.domain.dto.system.RolePermission> rolePermissions) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "delete", rolePermissions);
        try {
            if (rolePermissions == null) {
                throw new org.seasar.doma.DomaNullPointerException("rolePermissions");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<com.sample.domain.dto.system.RolePermission> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method6, com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntities(rolePermissions);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method6, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<com.sample.domain.dto.system.RolePermission> rolePermissions) {
        entering("com.sample.domain.dao.system.RolePermissionDaoImpl", "insert", rolePermissions);
        try {
            if (rolePermissions == null) {
                throw new org.seasar.doma.DomaNullPointerException("rolePermissions");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<com.sample.domain.dto.system.RolePermission> __query = getQueryImplementors().createAutoBatchInsertQuery(__method7, com.sample.domain.dto.system._RolePermission.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setEntities(rolePermissions);
            __query.setCallerClassName("com.sample.domain.dao.system.RolePermissionDaoImpl");
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
            exiting("com.sample.domain.dao.system.RolePermissionDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.RolePermissionDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
