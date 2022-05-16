package com.sample.domain.dao.users;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:38.403+0900")
public class UserRoleDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.domain.dao.users.UserRoleDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "selectAll", com.sample.domain.dto.user.UserCriteria.class, com.sample.domain.dto.system.PermissionCriteria.class, org.seasar.doma.jdbc.SelectOptions.class, java.util.stream.Collector.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "selectByUserId", java.lang.Long.class, java.util.stream.Collector.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "selectById", java.lang.Long.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "select", com.sample.domain.dto.system.PermissionCriteria.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "insert", com.sample.domain.dto.user.UserRole.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "update", com.sample.domain.dto.user.UserRole.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "delete", com.sample.domain.dto.user.UserRole.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.users.UserRoleDao.class, "insert", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UserRoleDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public <R> R selectAll(com.sample.domain.dto.user.UserCriteria userCriteria, com.sample.domain.dto.system.PermissionCriteria permissionCriteria, org.seasar.doma.jdbc.SelectOptions options, java.util.stream.Collector<com.sample.domain.dto.user.UserRole, ?, R> collector) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "selectAll", userCriteria, permissionCriteria, options, collector);
        try {
            if (userCriteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("userCriteria");
            }
            if (permissionCriteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("permissionCriteria");
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
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/users/UserRoleDao/selectAll.sql");
            __query.setOptions(options);
            __query.setEntityType(com.sample.domain.dto.user._UserRole.getSingletonInternal());
            __query.addParameter("userCriteria", com.sample.domain.dto.user.UserCriteria.class, userCriteria);
            __query.addParameter("permissionCriteria", com.sample.domain.dto.system.PermissionCriteria.class, permissionCriteria);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityCollectorHandler<com.sample.domain.dto.user.UserRole, R>(com.sample.domain.dto.user._UserRole.getSingletonInternal(), collector));
            R __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public <R> R selectByUserId(java.lang.Long id, java.util.stream.Collector<com.sample.domain.dto.user.UserRole, ?, R> collector) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "selectByUserId", id, collector);
        try {
            if (collector == null) {
                throw new org.seasar.doma.DomaNullPointerException("collector");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/users/UserRoleDao/selectByUserId.sql");
            __query.setEntityType(com.sample.domain.dto.user._UserRole.getSingletonInternal());
            __query.addParameter("id", java.lang.Long.class, id);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
            __query.setCallerMethodName("selectByUserId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntityCollectorHandler<com.sample.domain.dto.user.UserRole, R>(com.sample.domain.dto.user._UserRole.getSingletonInternal(), collector));
            R __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "selectByUserId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "selectByUserId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.Permission> selectById(java.lang.Long id) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/users/UserRoleDao/selectById.sql");
            __query.setEntityType(com.sample.domain.dto.system._Permission.getSingletonInternal());
            __query.addParameter("id", java.lang.Long.class, id);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.Permission>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.Permission>(com.sample.domain.dto.system._Permission.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.Permission> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.Permission> select(com.sample.domain.dto.system.PermissionCriteria criteria) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "select", criteria);
        try {
            if (criteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("criteria");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/users/UserRoleDao/select.sql");
            __query.setEntityType(com.sample.domain.dto.system._Permission.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.PermissionCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
            __query.setCallerMethodName("select");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.Permission>> __command = getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.Permission>(com.sample.domain.dto.system._Permission.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.Permission> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "select", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "select", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.sample.domain.dto.user.UserRole userRole) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "insert", userRole);
        try {
            if (userRole == null) {
                throw new org.seasar.doma.DomaNullPointerException("userRole");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.sample.domain.dto.user.UserRole> __query = getQueryImplementors().createAutoInsertQuery(__method4, com.sample.domain.dto.user._UserRole.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(userRole);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames("roleName", "permissionKey", "permissionName");
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.sample.domain.dto.user.UserRole userRole) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "update", userRole);
        try {
            if (userRole == null) {
                throw new org.seasar.doma.DomaNullPointerException("userRole");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.user.UserRole> __query = getQueryImplementors().createAutoUpdateQuery(__method5, com.sample.domain.dto.user._UserRole.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(userRole);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames("roleName", "permissionKey", "permissionName");
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = getCommandImplementors().createUpdateCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(com.sample.domain.dto.user.UserRole userRole) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "delete", userRole);
        try {
            if (userRole == null) {
                throw new org.seasar.doma.DomaNullPointerException("userRole");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.user.UserRole> __query = getQueryImplementors().createAutoUpdateQuery(__method6, com.sample.domain.dto.user._UserRole.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntity(userRole);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
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
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<com.sample.domain.dto.user.UserRole> userRoles) {
        entering("com.sample.domain.dao.users.UserRoleDaoImpl", "insert", userRoles);
        try {
            if (userRoles == null) {
                throw new org.seasar.doma.DomaNullPointerException("userRoles");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<com.sample.domain.dto.user.UserRole> __query = getQueryImplementors().createAutoBatchInsertQuery(__method7, com.sample.domain.dto.user._UserRole.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setEntities(userRoles);
            __query.setCallerClassName("com.sample.domain.dao.users.UserRoleDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames("roleName", "permissionKey", "permissionName");
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method7, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.users.UserRoleDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.users.UserRoleDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
