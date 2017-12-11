package com.jx.test.find.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.jx.test.find.greendao.CollectBean;
import com.jx.test.find.greendao.HistroyBean;

import com.jx.test.find.greendao.gen.CollectBeanDao;
import com.jx.test.find.greendao.gen.HistroyBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig collectBeanDaoConfig;
    private final DaoConfig histroyBeanDaoConfig;

    private final CollectBeanDao collectBeanDao;
    private final HistroyBeanDao histroyBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        collectBeanDaoConfig = daoConfigMap.get(CollectBeanDao.class).clone();
        collectBeanDaoConfig.initIdentityScope(type);

        histroyBeanDaoConfig = daoConfigMap.get(HistroyBeanDao.class).clone();
        histroyBeanDaoConfig.initIdentityScope(type);

        collectBeanDao = new CollectBeanDao(collectBeanDaoConfig, this);
        histroyBeanDao = new HistroyBeanDao(histroyBeanDaoConfig, this);

        registerDao(CollectBean.class, collectBeanDao);
        registerDao(HistroyBean.class, histroyBeanDao);
    }
    
    public void clear() {
        collectBeanDaoConfig.clearIdentityScope();
        histroyBeanDaoConfig.clearIdentityScope();
    }

    public CollectBeanDao getCollectBeanDao() {
        return collectBeanDao;
    }

    public HistroyBeanDao getHistroyBeanDao() {
        return histroyBeanDao;
    }

}