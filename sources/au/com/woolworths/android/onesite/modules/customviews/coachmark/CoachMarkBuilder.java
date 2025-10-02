package au.com.woolworths.android.onesite.modules.customviews.coachmark;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/coachmark/CoachMarkBuilder;", "", "Companion", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CoachMarkBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f4321a;
    public final View b;
    public final CoachMarkSettings c;
    public Function1 d;
    public Function1 e;
    public Function0 f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/customviews/coachmark/CoachMarkBuilder$Companion;", "", "", "CORNER_RADIUS_IN_DP", "F", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ShowAlign.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ShowAlign[] showAlignArr = ShowAlign.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ShowAlign[] showAlignArr2 = ShowAlign.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ShowAlign[] showAlignArr3 = ShowAlign.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CoachMarkBuilder(Context context, LifecycleOwner lifecycleOwner, View contentView, CoachMarkSettings coachMarkSettings) {
        Intrinsics.h(context, "context");
        Intrinsics.h(lifecycleOwner, "lifecycleOwner");
        Intrinsics.h(contentView, "contentView");
        this.f4321a = lifecycleOwner;
        this.b = contentView;
        this.c = coachMarkSettings;
    }
}
