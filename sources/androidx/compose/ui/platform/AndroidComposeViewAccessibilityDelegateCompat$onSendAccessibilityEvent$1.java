package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/accessibility/AccessibilityEvent;", "invoke", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends Lambda implements Function1<AccessibilityEvent, Boolean> {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.h = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.h;
        return Boolean.valueOf(androidComposeViewAccessibilityDelegateCompat.d.getParent().requestSendAccessibilityEvent(androidComposeViewAccessibilityDelegateCompat.d, (AccessibilityEvent) obj));
    }
}
