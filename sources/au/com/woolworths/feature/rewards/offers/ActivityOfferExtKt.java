package au.com.woolworths.feature.rewards.offers;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityOfferExtKt {
    public static final void a(Context context, OfferActivationMessage message) {
        Intrinsics.h(context, "<this>");
        Intrinsics.h(message, "message");
        new AlertDialog.Builder(context).setTitle(message.getTitle()).setMessage(message.getMessage()).setPositiveButton(message.getButtonLabel(), (DialogInterface.OnClickListener) null).show();
    }
}
