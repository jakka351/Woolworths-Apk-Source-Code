package au.com.woolworths.base.wallet.digipay.framesview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/SubmitFormCommand;", "Lau/com/woolworths/base/wallet/digipay/framesview/JavaScriptCommand;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubmitFormCommand extends JavaScriptCommand {
    public static final SubmitFormCommand b = new SubmitFormCommand("frames.submit = async function() {\n         try {\n           await this.action.submit()\n           var response = await this.action.complete()\n           android.handleOnComplete(JSON.stringify(response))\n         } catch (error) {\n           android.handleUncaughtError(JSON.stringify(error))\n         }  \n    }\n    frames.submit();");
}
