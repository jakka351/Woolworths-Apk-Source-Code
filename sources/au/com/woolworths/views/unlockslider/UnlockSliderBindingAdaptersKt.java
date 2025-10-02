package au.com.woolworths.views.unlockslider;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-views_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnlockSliderBindingAdaptersKt {
    public static final void a(UnlockSlider unlockSlider) throws Resources.NotFoundException {
        Intrinsics.h(unlockSlider, "unlockSlider");
        try {
            Context context = unlockSlider.getContext();
            String resourceTypeName = context.getResources().getResourceTypeName(R.attr.colorPrimary);
            if (Intrinsics.c(resourceTypeName, "color")) {
                unlockSlider.setButtonTint(context.getColor(R.attr.colorPrimary));
                return;
            }
            if (Intrinsics.c(resourceTypeName, "attr")) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                unlockSlider.setButtonTint(context.getColor(typedValue.resourceId));
            } else {
                Timber.f27013a.b("UNLOCK SLIDER: unhandled resource type: " + resourceTypeName, new Object[0]);
            }
        } catch (Resources.NotFoundException unused) {
            unlockSlider.setButtonTint(R.attr.colorPrimary);
        }
    }
}
