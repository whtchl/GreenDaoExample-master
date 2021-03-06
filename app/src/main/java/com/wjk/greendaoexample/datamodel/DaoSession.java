package com.wjk.greendaoexample.datamodel;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.wjk.greendaoexample.datamodel.Area;
import com.wjk.greendaoexample.datamodel.People;
import com.wjk.greendaoexample.datamodel.Product;
import com.wjk.greendaoexample.datamodel.Country;

import com.wjk.greendaoexample.datamodel.AreaDao;
import com.wjk.greendaoexample.datamodel.PeopleDao;
import com.wjk.greendaoexample.datamodel.ProductDao;
import com.wjk.greendaoexample.datamodel.CountryDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig areaDaoConfig;
    private final DaoConfig peopleDaoConfig;
    private final DaoConfig productDaoConfig;
    private final DaoConfig countryDaoConfig;

    private final AreaDao areaDao;
    private final PeopleDao peopleDao;
    private final ProductDao productDao;
    private final CountryDao countryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        areaDaoConfig = daoConfigMap.get(AreaDao.class).clone();
        areaDaoConfig.initIdentityScope(type);

        peopleDaoConfig = daoConfigMap.get(PeopleDao.class).clone();
        peopleDaoConfig.initIdentityScope(type);

        productDaoConfig = daoConfigMap.get(ProductDao.class).clone();
        productDaoConfig.initIdentityScope(type);

        countryDaoConfig = daoConfigMap.get(CountryDao.class).clone();
        countryDaoConfig.initIdentityScope(type);

        areaDao = new AreaDao(areaDaoConfig, this);
        peopleDao = new PeopleDao(peopleDaoConfig, this);
        productDao = new ProductDao(productDaoConfig, this);
        countryDao = new CountryDao(countryDaoConfig, this);

        registerDao(Area.class, areaDao);
        registerDao(People.class, peopleDao);
        registerDao(Product.class, productDao);
        registerDao(Country.class, countryDao);
    }
    
    public void clear() {
        areaDaoConfig.clearIdentityScope();
        peopleDaoConfig.clearIdentityScope();
        productDaoConfig.clearIdentityScope();
        countryDaoConfig.clearIdentityScope();
    }

    public AreaDao getAreaDao() {
        return areaDao;
    }

    public PeopleDao getPeopleDao() {
        return peopleDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public CountryDao getCountryDao() {
        return countryDao;
    }

}
