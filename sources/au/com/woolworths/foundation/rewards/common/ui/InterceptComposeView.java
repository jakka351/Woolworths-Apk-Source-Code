package au.com.woolworths.foundation.rewards.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/InterceptComposeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "e", "I", "getErrorWidth", "()I", "setErrorWidth", "(I)V", "errorWidth", "f", "getErrorHeight", "setErrorHeight", "errorHeight", "ViewTreeNotReadyException", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InterceptComposeView extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final au.com.woolworths.feature.shop.recipes.recipes.list.b d;

    /* renamed from: e, reason: from kotlin metadata */
    public int errorWidth;

    /* renamed from: f, reason: from kotlin metadata */
    public int errorHeight;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/InterceptComposeView$ViewTreeNotReadyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewTreeNotReadyException extends Exception {
    }

    public InterceptComposeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.d = new au.com.woolworths.feature.shop.recipes.recipes.list.b(24);
    }

    public final int getErrorHeight() {
        return this.errorHeight;
    }

    public final int getErrorWidth() {
        return this.errorWidth;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) throws InterceptException {
        au.com.woolworths.feature.shop.recipes.recipes.list.b bVar = this.d;
        try {
            super.onMeasure(i, i2);
        } catch (IllegalArgumentException e) {
            bVar.invoke(e);
            throw new InterceptException(e);
        } catch (IllegalStateException e2) {
            bVar.invoke(e2);
            throw new InterceptException(e2);
        }
    }

    public final void setErrorHeight(int i) {
        this.errorHeight = i;
    }

    public final void setErrorWidth(int i) {
        this.errorWidth = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptComposeView(@NotNull Context context) {
        this(context, null, 0, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.h(context, "context");
    }
}
