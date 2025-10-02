package com.salesforce.marketingcloud.sfmcsdk.modules.push;

import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/Config;", "moduleApplicationId", "", "(Ljava/lang/String;)V", "getModuleApplicationId", "()Ljava/lang/String;", "moduleIdentifier", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;", "getModuleIdentifier", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;", "version", "", "getVersion", "()I", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PushModuleConfig implements Config {

    @NotNull
    private final String moduleApplicationId;

    @NotNull
    private final ModuleIdentifier moduleIdentifier;
    private final int version;

    public PushModuleConfig(@NotNull String moduleApplicationId) {
        Intrinsics.h(moduleApplicationId, "moduleApplicationId");
        this.moduleApplicationId = moduleApplicationId;
        this.moduleIdentifier = ModuleIdentifier.PUSH;
        this.version = 1;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.Config
    @NotNull
    public String getModuleApplicationId() {
        return this.moduleApplicationId;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.Config
    @NotNull
    public ModuleIdentifier getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.Config
    public int getVersion() {
        return this.version;
    }
}
