package io.nuls.mq;

import io.nuls.task.InchainModule;
import io.nuls.task.ModuleStatus;

/**
 * Created by Niels on 2017/9/26.
 * nuls.io
 */
public abstract class MQModule implements InchainModule {

    protected MQModule(){
        this.moduleName = this.getClass().getSimpleName();
        this.status = ModuleStatus.UNSTART;
    }
    private String moduleName;
    private ModuleStatus status;

    @Override
    public String getModuleName() {
        return this.moduleName;
    }

    @Override
    public void reboot() {
        this.shutdown();
        this.start();
    }

    @Override
    public ModuleStatus getStatus() {
        return status;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setStatus(ModuleStatus status) {
        this.status = status;
    }
}
