package cn.tofly.mis.waterusermanager.testmodule;

import cn.tofly.mis.waterusermanager.data.local.DBInstance;
import cn.tofly.mis.waterusermanager.data.remote.IExampleNetService;
import dagger.Module;
import dagger.Provides;

/**
 * 提供实例
 * Created by hasee on 2016/9/26.
 */
@Module
public class TestModule {

    private TestContract.View mView;

    public TestModule(TestFragment fragment) {
        mView = fragment;
    }

    @Provides
    TestContract.View providerView() {
        return this.mView;
    }


    @Provides
    TestPresenter providerTestPresenter(TestContract.View view, IExampleNetService service, DBInstance dbInstance) {
        return new TestPresenter(view, service, dbInstance);
    }


}
