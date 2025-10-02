package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/BuildFramesCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/JavaScriptCommand;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuildFramesCommand extends JavaScriptCommand {
    public static final BuildFramesCommand b = new BuildFramesCommand("        frames.build = async function() {\n            try {\n                await this.createFrameSDK();\n                await this.createAction();\n                await this.startAction();\n                if (this.controls.length > 0) {\n                    await this.controls.forEach((createControl) => {\n                        createControl(this.action)\n                    });\n                }\n                android.handleOnRendered()\n            } catch (error) {\n                android.handleUncaughtError(JSON.stringify(error))\n            }\n        }\n        frames.build();        ");
}
