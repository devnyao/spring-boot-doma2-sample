package com.sample.domain.dao.system;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2022-05-16T10:34:38.205+0900")
public class SendMailQueueDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.domain.dao.system.SendMailQueueDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.SendMailQueueDao.class, "selectAll", com.sample.domain.dto.system.SendMailQueueCriteria.class, org.seasar.doma.jdbc.SelectOptions.class, java.util.stream.Collector.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.SendMailQueueDao.class, "insert", java.util.List.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.domain.dao.system.SendMailQueueDao.class, "update", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public SendMailQueueDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public <R> R selectAll(com.sample.domain.dto.system.SendMailQueueCriteria criteria, org.seasar.doma.jdbc.SelectOptions options, java.util.stream.Collector<com.sample.domain.dto.system.SendMailQueue, ?, R> collector) {
        entering("com.sample.domain.dao.system.SendMailQueueDaoImpl", "selectAll", criteria, options, collector);
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
            __query.setSqlFilePath("META-INF/com/sample/domain/dao/system/SendMailQueueDao/selectAll.sql");
            __query.setOptions(options);
            __query.setEntityType(com.sample.domain.dto.system._SendMailQueue.getSingletonInternal());
            __query.addParameter("criteria", com.sample.domain.dto.system.SendMailQueueCriteria.class, criteria);
            __query.setCallerClassName("com.sample.domain.dao.system.SendMailQueueDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<R> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityCollectorHandler<com.sample.domain.dto.system.SendMailQueue, R>(com.sample.domain.dto.system._SendMailQueue.getSingletonInternal(), collector));
            R __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.SendMailQueueDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.SendMailQueueDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public int[] insert(java.util.List<com.sample.domain.dto.system.SendMailQueue> sendMailQueues) {
        entering("com.sample.domain.dao.system.SendMailQueueDaoImpl", "insert", sendMailQueues);
        try {
            if (sendMailQueues == null) {
                throw new org.seasar.doma.DomaNullPointerException("sendMailQueues");
            }
            org.seasar.doma.jdbc.query.AutoBatchInsertQuery<com.sample.domain.dto.system.SendMailQueue> __query = getQueryImplementors().createAutoBatchInsertQuery(__method1, com.sample.domain.dto.system._SendMailQueue.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setEntities(sendMailQueues);
            __query.setCallerClassName("com.sample.domain.dao.system.SendMailQueueDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchInsertCommand __command = getCommandImplementors().createBatchInsertCommand(__method1, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.SendMailQueueDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.SendMailQueueDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int[] update(java.util.List<com.sample.domain.dto.system.SendMailQueue> sendMailQueues) {
        entering("com.sample.domain.dao.system.SendMailQueueDaoImpl", "update", sendMailQueues);
        try {
            if (sendMailQueues == null) {
                throw new org.seasar.doma.DomaNullPointerException("sendMailQueues");
            }
            org.seasar.doma.jdbc.query.AutoBatchUpdateQuery<com.sample.domain.dto.system.SendMailQueue> __query = getQueryImplementors().createAutoBatchUpdateQuery(__method2, com.sample.domain.dto.system._SendMailQueue.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setEntities(sendMailQueues);
            __query.setCallerClassName("com.sample.domain.dao.system.SendMailQueueDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.BatchUpdateCommand __command = getCommandImplementors().createBatchUpdateCommand(__method2, __query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("com.sample.domain.dao.system.SendMailQueueDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.domain.dao.system.SendMailQueueDaoImpl", "update", __e);
            throw __e;
        }
    }

}
