package com.salesforce.marketingcloud.sfmcsdk;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModule;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SFMCSdk$Companion$configure$1$3$2$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SFMCSdkComponents $components;
    final /* synthetic */ Config $config;
    final /* synthetic */ Context $context;
    final /* synthetic */ CountDownLatch $moduleInitLatch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SFMCSdk$Companion$configure$1$3$2$4(Context context, Config config, SFMCSdkComponents sFMCSdkComponents, CountDownLatch countDownLatch) {
        super(0);
        this.$context = context;
        this.$config = config;
        this.$components = sFMCSdkComponents;
        this.$moduleInitLatch = countDownLatch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m262invoke$lambda1(CountDownLatch moduleInitLatch, final Config config, ModuleInterface module) {
        Intrinsics.h(moduleInitLatch, "$moduleInitLatch");
        Intrinsics.h(config, "$config");
        Intrinsics.h(module, "module");
        moduleInitLatch.countDown();
        Identity.INSTANCE.getInstance().setModuleIdentity$sfmcsdk_release(module.getModuleIdentity());
        SFMCSdkLogger.INSTANCE.d("~$SFMCSdk", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdk$Companion$configure$1$3$2$4$1$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Module (" + config.getModuleIdentifier() + ") has completed initialization.";
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m263invoke();
        return Unit.f24250a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m263invoke() {
        CdpModule cdpModule$sfmcsdk_release = SFMCSdk.INSTANCE.getCdpModule$sfmcsdk_release();
        Context context = this.$context;
        Config config = this.$config;
        cdpModule$sfmcsdk_release.initModule(context, config, this.$components, new a(this.$moduleInitLatch, config, 1));
    }
}
