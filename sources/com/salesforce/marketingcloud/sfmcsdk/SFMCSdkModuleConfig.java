package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleConfig;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig;", "", "builder", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig$Builder;", "(Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig$Builder;)V", "pushModuleConfig", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;", "cdpModuleConfig", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModuleConfig;", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModuleConfig;)V", "getCdpModuleConfig", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModuleConfig;", "configs", "", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/Config;", "getConfigs$sfmcsdk_release", "()Ljava/util/List;", "setConfigs$sfmcsdk_release", "(Ljava/util/List;)V", "getPushModuleConfig", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;", "Builder", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SFMCSdkModuleConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final CdpModuleConfig cdpModuleConfig;

    @NotNull
    private List<? extends Config> configs;

    @Nullable
    private final PushModuleConfig pushModuleConfig;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig$Builder;", "", "()V", "value", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModuleConfig;", "cdpModuleConfig", "getCdpModuleConfig", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModuleConfig;", "setCdpModuleConfig", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/cdp/CdpModuleConfig;)V", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;", "pushModuleConfig", "getPushModuleConfig", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;", "setPushModuleConfig", "(Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleConfig;)V", "build", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig;", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private static final String TAG = "~$SFMCSdkModuleConfig.Builder";

        @Nullable
        private CdpModuleConfig cdpModuleConfig;

        @Nullable
        private PushModuleConfig pushModuleConfig;

        @NotNull
        public final SFMCSdkModuleConfig build() {
            return new SFMCSdkModuleConfig(this, (DefaultConstructorMarker) null);
        }

        @Nullable
        public final CdpModuleConfig getCdpModuleConfig() {
            return this.cdpModuleConfig;
        }

        @Nullable
        public final PushModuleConfig getPushModuleConfig() {
            return this.pushModuleConfig;
        }

        public final void setCdpModuleConfig(@Nullable final CdpModuleConfig cdpModuleConfig) {
            if (cdpModuleConfig == null || !cdpModuleConfig.isModuleCompatible()) {
                SFMCSdkLogger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig$Builder$cdpModuleConfig$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "isModuleCompatible returned false. Config '" + cdpModuleConfig + "' will not be applied.";
                    }
                });
                cdpModuleConfig = null;
            }
            this.cdpModuleConfig = cdpModuleConfig;
        }

        public final void setPushModuleConfig(@Nullable final PushModuleConfig pushModuleConfig) {
            if (pushModuleConfig == null || !pushModuleConfig.isModuleCompatible()) {
                SFMCSdkLogger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig$Builder$pushModuleConfig$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "isModuleCompatible returned false. Config '" + pushModuleConfig + "' will not be applied.";
                    }
                });
                pushModuleConfig = null;
            }
            this.pushModuleConfig = pushModuleConfig;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig$Companion;", "", "()V", "build", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig;", "block", "Lkotlin/Function1;", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig$Builder;", "", "Lkotlin/ExtensionFunctionType;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SFMCSdkModuleConfig build(@NotNull Function1<? super Builder, Unit> block) {
            Intrinsics.h(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SFMCSdkModuleConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @JvmStatic
    @NotNull
    public static final SFMCSdkModuleConfig build(@NotNull Function1<? super Builder, Unit> function1) {
        return INSTANCE.build(function1);
    }

    @Nullable
    public final CdpModuleConfig getCdpModuleConfig() {
        return this.cdpModuleConfig;
    }

    @NotNull
    public final List<Config> getConfigs$sfmcsdk_release() {
        return this.configs;
    }

    @Nullable
    public final PushModuleConfig getPushModuleConfig() {
        return this.pushModuleConfig;
    }

    public final void setConfigs$sfmcsdk_release(@NotNull List<? extends Config> list) {
        Intrinsics.h(list, "<set-?>");
        this.configs = list;
    }

    private SFMCSdkModuleConfig(PushModuleConfig pushModuleConfig, CdpModuleConfig cdpModuleConfig) {
        this.pushModuleConfig = pushModuleConfig;
        this.cdpModuleConfig = cdpModuleConfig;
        this.configs = ArraysKt.F(new Config[]{pushModuleConfig, cdpModuleConfig});
    }

    private SFMCSdkModuleConfig(Builder builder) {
        this(builder.getPushModuleConfig(), builder.getCdpModuleConfig());
    }
}
