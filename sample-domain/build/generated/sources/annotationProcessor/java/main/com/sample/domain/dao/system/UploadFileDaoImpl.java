package com.sample.domain.dao.system;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:38.312+0900")
public class UploadFileDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.domain.dao.system.UploadFileDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.UploadFileDao.class, "selectAll", com.sample.domain.dto.system.UploadFileCriteria.class, org.seasar.doma.jdbc.SelectOptions.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.UploadFileDao.class, "selectById", java.lang.Long.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.UploadFileDao.class, "select", com.sample.domain.dto.system.UploadFileCriteria.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.UploadFileDao.class, "insert", com.sample.domain.dto.system.UploadFile.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.UploadFileDao.class, "update", com.sample.domain.dto.system.UploadFile.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.UploadFileDao.class, "delete", com.sample.domain.dto.system.UploadFile.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.UploadFileDao.class, "insert", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UploadFileDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.sample.domain.dto.system.UploadFile> selectAll(com.sample.domain.dto.system.UploadFileCriteria criteria, org.seasar.doma.jdbc.SelectOptions options) {
        entering("com.sample.domain.dao.system.UploadFileDaoImpl", "selectAll", criteria, options);
        try {
            if (criteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("criteria");
            }
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/UploadFileDao/selectAll.sql");
            __query.setOptions(options);
            __query.setEntityType(com.sample.domain.dto.system._UploadFile.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.UploadFileCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.UploadFileDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.sample.domain.dto.system.UploadFile>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.sample.domain.dto.system.UploadFile>(com.sample.domain.dto.system._UploadFile.getSingletonInternal()));
            java.util.List<com.sample.domain.dto.system.UploadFile> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.UploadFileDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.UploadFileDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public com.sample.domain.dto.system.UploadFile selectById(java.lang.Long id) {
        entering("com.sample.domain.dao.system.UploadFileDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/UploadFileDao/selectById.sql");
            __query.setEntityType(com.sample.domain.dto.system._UploadFile.getSingletonInternal());
            __query.addParameter("id", java.lang.Long.class, id);
            __query.setCallerClassName("com.sample.domain.dao.system.UploadFileDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.sample.domain.dto.system.UploadFile> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.sample.domain.dto.system.UploadFile>(com.sample.domain.dto.system._UploadFile.getSingletonInternal()));
            com.sample.domain.dto.system.UploadFile __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.UploadFileDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.UploadFileDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public com.sample.domain.dto.system.UploadFile select(com.sample.domain.dto.system.UploadFileCriteria criteria) {
        entering("com.sample.domain.dao.system.UploadFileDaoImpl", "select", criteria);
        try {
            if (criteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("criteria");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/UploadFileDao/select.sql");
            __query.setEntityType(com.sample.domain.dto.system._UploadFile.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.UploadFileCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.UploadFileDaoImpl");
            __query.setCallerMethodName("select");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.sample.domain.dto.system.UploadFile> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.sample.domain.dto.system.UploadFile>(com.sample.domain.dto.system._UploadFile.getSingletonInternal()));
            com.sample.domain.dto.system.UploadFile __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.UploadFileDaoImpl", "select", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.UploadFileDaoImpl", "select", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.sample.domain.dto.system.UploadFile uploadFile) {
        entering("com.sample.domain.dao.system.UploadFileDaoImpl", "insert", uploadFile);
        try {
            if (uploadFile == null) {
                throw new org.seasar.doma.DomaNullPointerException("uploadFile");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.sample.domain.dto.system.UploadFile> __query = getQueryImplementors().createAutoInsertQuery(__method3, com.sample.domain.dto.system._UploadFile.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(uploadFile);
            __query.setCallerClassName("com.sample.domain.dao.system.UploadFileDaoImpl");
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
            exiting("com.sample.domain.dao.system.UploadFileDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.UploadFileDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.sample.domain.dto.system.UploadFile uploadFile) {
        entering("com.sample.domain.dao.system.UploadFileDaoImpl", "update", uploadFile);
        try {
            if (uploadFile == null) {
                throw new org.seasar.doma.DomaNullPointerException("uploadFile");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.UploadFile> __query = getQueryImplementors().createAutoUpdateQuery(__method4, com.sample.domain.dto.system._UploadFile.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(uploadFile);
            __query.setCallerClassName("com.sample.domain.dao.system.UploadFileDaoImpl");
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
            exiting("com.sample.domain.dao.system.UploadFileDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.UploadFileDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(com.sample.domain.dto.system.UploadFile uploadFile) {
        entering("com.sample.domain.dao.system.UploadFileDaoImpl", "delete", uploadFile);
        try {
            if (uploadFile == null) {
                throw new org.seasar.doma.DomaNullPointerException("uploadFile");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.UploadFile> __query = getQueryImplementors().createAutoUpdateQuery(__method5, com.sample.domain.dto.system._UploadFile.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(uploadFile);
            __query.setCallerClassName("com.sample.domain.dao.system.UploadFileDaoImpl");
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
            exiting("com.sample.domain.dao.system.UploadFileDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.UploadFileDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<com.sample.domain.dto.system.UploadFile> uploadFiles) {
        entering("com.sample.domain.dao.system.UploadFileDaoImpl", "insert", uploadFiles);
        try {
            if (uploadFiles == null) {
                throw new org.seasar.doma.DomaNullPointerException("uploadFiles");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<com.sample.domain.dto.system.UploadFile> __query = getQueryImplementors().createAutoBatchInsertQuery(__method6, com.sample.domain.dto.system._UploadFile.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntities(uploadFiles);
            __query.setCallerClassName("com.sample.domain.dao.system.UploadFileDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method6, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.UploadFileDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.UploadFileDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
