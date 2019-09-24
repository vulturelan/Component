package com.example.jeremy.componentlib;

public class ServiceFactory {

    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getLoginService() {
        if (mLoginService == null) {
            return new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setLoginService(ILoginService loginService) {
        mLoginService = loginService;
    }

    public IMineService getMineService() {
        return mMineService;
    }

    public void setMineService(IMineService mineService) {
        mMineService = mineService;
    }
}
