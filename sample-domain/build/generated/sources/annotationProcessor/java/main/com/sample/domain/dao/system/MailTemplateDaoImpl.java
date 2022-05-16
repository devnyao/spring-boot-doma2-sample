package com.sample.domain.dao.system;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:38.281+0900")
public class MailTemplateDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.domain.dao.system.MailTemplateDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "selectAll", com.sample.domain.dto.system.MailTemplateCriteria.class, org.seasar.doma.jdbc.SelectOptions.class, java.util.stream.Collector.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "selectById", java.lang.Long.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "select", com.sample.domain.dto.system.MailTemplateCriteria.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "insert", com.sample.domain.dto.system.MailTemplate.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "update", com.sample.domain.dto.system.MailTemplate.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "delete", com.sample.domain.dto.system.MailTemplate.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.MailTemplateDao.class, "update", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public MailTemplateDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public <R> R selectAll(com.sample.domain.dto.system.MailTemplateCriteria criteria, org.seasar.doma.jdbc.SelectOptions options, java.util.stream.Collector<com.sample.domain.dto.system.MailTemplate, ?, R> collector) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "selectAll", criteria, options, collector);
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
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/MailTemplateDao/selectAll.sql");
            __query.setOptions(options);
            __query.setEntityType(com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.MailTemplateCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityCollectorHandler<com.sample.domain.dto.system.MailTemplate, R>(com.sample.domain.dto.system._MailTemplate.getSingletonInternal(), collector));
            R __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.MailTemplate> selectById(java.lang.Long id) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/MailTemplateDao/selectById.sql");
            __query.setEntityType(com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.addParameter("id", java.lang.Long.class, id);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.MailTemplate>> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.MailTemplate>(com.sample.domain.dto.system._MailTemplate.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.MailTemplate> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.sample.domain.dto.system.MailTemplate> select(com.sample.domain.dto.system.MailTemplateCriteria criteria) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "select", criteria);
        try {
            if (criteria == null) {
                throw new org.seasar.doma.DomaNullPointerException("criteria");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/MailTemplateDao/select.sql");
            __query.setEntityType(com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.MailTemplateCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
            __query.setCallerMethodName("select");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.sample.domain.dto.system.MailTemplate>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.sample.domain.dto.system.MailTemplate>(com.sample.domain.dto.system._MailTemplate.getSingletonInternal()));
            java.util.Optional<com.sample.domain.dto.system.MailTemplate> __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "select", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "select", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.sample.domain.dto.system.MailTemplate mailtemplate) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "insert", mailtemplate);
        try {
            if (mailtemplate == null) {
                throw new org.seasar.doma.DomaNullPointerException("mailtemplate");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.sample.domain.dto.system.MailTemplate> __query = getQueryImplementors().createAutoInsertQuery(__method3, com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__config);
            __query.setEntity(mailtemplate);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
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
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.sample.domain.dto.system.MailTemplate mailTemplate) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "update", mailTemplate);
        try {
            if (mailTemplate == null) {
                throw new org.seasar.doma.DomaNullPointerException("mailTemplate");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.MailTemplate> __query = getQueryImplementors().createAutoUpdateQuery(__method4, com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__config);
            __query.setEntity(mailTemplate);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
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
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int delete(com.sample.domain.dto.system.MailTemplate mailTemplate) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "delete", mailTemplate);
        try {
            if (mailTemplate == null) {
                throw new org.seasar.doma.DomaNullPointerException("mailTemplate");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.sample.domain.dto.system.MailTemplate> __query = getQueryImplementors().createAutoUpdateQuery(__method5, com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__config);
            __query.setEntity(mailTemplate);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
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
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<com.sample.domain.dto.system.MailTemplate> mailTemplates) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "insert", mailTemplates);
        try {
            if (mailTemplates == null) {
                throw new org.seasar.doma.DomaNullPointerException("mailTemplates");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<com.sample.domain.dto.system.MailTemplate> __query = getQueryImplementors().createAutoBatchInsertQuery(__method6, com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(__config);
            __query.setEntities(mailTemplates);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
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
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int[] update(java.util.List<com.sample.domain.dto.system.MailTemplate> mailtemplates) {
        entering("com.sample.domain.dao.system.MailTemplateDaoImpl", "update", mailtemplates);
        try {
            if (mailtemplates == null) {
                throw new org.seasar.doma.DomaNullPointerException("mailtemplates");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<com.sample.domain.dto.system.MailTemplate> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method7, com.sample.domain.dto.system._MailTemplate.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(__config);
            __query.setEntities(mailtemplates);
            __query.setCallerClassName("com.sample.domain.dao.system.MailTemplateDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method7, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.MailTemplateDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.MailTemplateDaoImpl", "update", __e);
            throw __e;
        }
    }

}
