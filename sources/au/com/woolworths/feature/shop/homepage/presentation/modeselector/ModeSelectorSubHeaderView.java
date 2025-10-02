package au.com.woolworths.feature.shop.homepage.presentation.modeselector;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import au.com.woolworths.feature.shop.homepage.data.ModeSelectorSubHeaderData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR/\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R;\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R;\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R;\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R;\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R/\u0010-\u001a\u0004\u0018\u00010'2\b\u0010\u000b\u001a\u0004\u0018\u00010'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R;\u00101\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R;\u00105\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019¨\u00066"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/modeselector/ModeSelectorSubHeaderView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/feature/shop/homepage/data/ModeSelectorSubHeaderData;", "<set-?>", "l", "Landroidx/compose/runtime/MutableState;", "getData", "()Lau/com/woolworths/feature/shop/homepage/data/ModeSelectorSubHeaderData;", "setData", "(Lau/com/woolworths/feature/shop/homepage/data/ModeSelectorSubHeaderData;)V", "data", "Lkotlin/Function0;", "", "m", "getOnTimeViewClick", "()Lkotlin/jvm/functions/Function0;", "setOnTimeViewClick", "(Lkotlin/jvm/functions/Function0;)V", "onTimeViewClick", "n", "getOnLocationViewClick", "setOnLocationViewClick", "onLocationViewClick", "o", "getOnInstoreNameClick", "setOnInstoreNameClick", "onInstoreNameClick", "p", "getOnInstoreTimeClick", "setOnInstoreTimeClick", "onInstoreTimeClick", "", "q", "getInstoreReminderPopupText", "()Ljava/lang/String;", "setInstoreReminderPopupText", "(Ljava/lang/String;)V", "instoreReminderPopupText", "r", "getOnDismissInstoreReminderPopup", "setOnDismissInstoreReminderPopup", "onDismissInstoreReminderPopup", "s", "getOnSetDeliveryAddressClick", "setOnSetDeliveryAddressClick", "onSetDeliveryAddressClick", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ModeSelectorSubHeaderView extends AbstractComposeView {
    public static final /* synthetic */ int t = 0;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableState data;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableState onTimeViewClick;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableState onLocationViewClick;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableState onInstoreNameClick;

    /* renamed from: p, reason: from kotlin metadata */
    public final MutableState onInstoreTimeClick;

    /* renamed from: q, reason: from kotlin metadata */
    public final MutableState instoreReminderPopupText;

    /* renamed from: r, reason: from kotlin metadata */
    public final MutableState onDismissInstoreReminderPopup;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableState onSetDeliveryAddressClick;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModeSelectorSubHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1224842370);
        if ((((composerImplV.n(this) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ModeSelectorSubHeaderData data = getData();
            final HomeModeSelectorContainerData homeModeSelectorContainerData = data != null ? data.b : null;
            ThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-2126192186, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderView$Content$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    CollectionMode collectionMode;
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ModeSelectorSubHeaderView modeSelectorSubHeaderView = this.d;
                        ModeSelectorSubHeaderData data2 = modeSelectorSubHeaderView.getData();
                        boolean z = data2 != null && data2.f7200a;
                        ModeSelectorSubHeaderData data3 = modeSelectorSubHeaderView.getData();
                        Text text = data3 != null ? data3.d : null;
                        Function0<Unit> onTimeViewClick = modeSelectorSubHeaderView.getOnTimeViewClick();
                        Function0<Unit> onLocationViewClick = modeSelectorSubHeaderView.getOnLocationViewClick();
                        Function0<Unit> onInstoreNameClick = modeSelectorSubHeaderView.getOnInstoreNameClick();
                        Function0<Unit> onInstoreTimeClick = modeSelectorSubHeaderView.getOnInstoreTimeClick();
                        ModeSelectorSubHeaderData data4 = modeSelectorSubHeaderView.getData();
                        if (data4 == null || (collectionMode = data4.f) == null) {
                            collectionMode = CollectionMode.NotSet.d;
                        }
                        ModeSelectorSubHeaderKt.e(z, homeModeSelectorContainerData, text, onTimeViewClick, onLocationViewClick, onInstoreNameClick, onInstoreTimeClick, collectionMode, modeSelectorSubHeaderView.getInstoreReminderPopupText(), modeSelectorSubHeaderView.getOnDismissInstoreReminderPopup(), modeSelectorSubHeaderView.getOnSetDeliveryAddressClick(), composer2, 0, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(i, 1, this);
        }
    }

    @Nullable
    public final ModeSelectorSubHeaderData getData() {
        return (ModeSelectorSubHeaderData) ((SnapshotMutableStateImpl) this.data).getD();
    }

    @Nullable
    public final String getInstoreReminderPopupText() {
        return (String) ((SnapshotMutableStateImpl) this.instoreReminderPopupText).getD();
    }

    @Nullable
    public final Function0<Unit> getOnDismissInstoreReminderPopup() {
        return (Function0) ((SnapshotMutableStateImpl) this.onDismissInstoreReminderPopup).getD();
    }

    @Nullable
    public final Function0<Unit> getOnInstoreNameClick() {
        return (Function0) ((SnapshotMutableStateImpl) this.onInstoreNameClick).getD();
    }

    @Nullable
    public final Function0<Unit> getOnInstoreTimeClick() {
        return (Function0) ((SnapshotMutableStateImpl) this.onInstoreTimeClick).getD();
    }

    @Nullable
    public final Function0<Unit> getOnLocationViewClick() {
        return (Function0) ((SnapshotMutableStateImpl) this.onLocationViewClick).getD();
    }

    @Nullable
    public final Function0<Unit> getOnSetDeliveryAddressClick() {
        return (Function0) ((SnapshotMutableStateImpl) this.onSetDeliveryAddressClick).getD();
    }

    @Nullable
    public final Function0<Unit> getOnTimeViewClick() {
        return (Function0) ((SnapshotMutableStateImpl) this.onTimeViewClick).getD();
    }

    public final void setData(@Nullable ModeSelectorSubHeaderData modeSelectorSubHeaderData) {
        ((SnapshotMutableStateImpl) this.data).setValue(modeSelectorSubHeaderData);
    }

    public final void setInstoreReminderPopupText(@Nullable String str) {
        ((SnapshotMutableStateImpl) this.instoreReminderPopupText).setValue(str);
    }

    public final void setOnDismissInstoreReminderPopup(@Nullable Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onDismissInstoreReminderPopup).setValue(function0);
    }

    public final void setOnInstoreNameClick(@Nullable Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onInstoreNameClick).setValue(function0);
    }

    public final void setOnInstoreTimeClick(@Nullable Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onInstoreTimeClick).setValue(function0);
    }

    public final void setOnLocationViewClick(@Nullable Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onLocationViewClick).setValue(function0);
    }

    public final void setOnSetDeliveryAddressClick(@Nullable Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onSetDeliveryAddressClick).setValue(function0);
    }

    public final void setOnTimeViewClick(@Nullable Function0<Unit> function0) {
        ((SnapshotMutableStateImpl) this.onTimeViewClick).setValue(function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModeSelectorSubHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ModeSelectorSubHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModeSelectorSubHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.data = SnapshotStateKt.f(null);
        this.onTimeViewClick = SnapshotStateKt.f(null);
        this.onLocationViewClick = SnapshotStateKt.f(null);
        this.onInstoreNameClick = SnapshotStateKt.f(null);
        this.onInstoreTimeClick = SnapshotStateKt.f(null);
        this.instoreReminderPopupText = SnapshotStateKt.f(null);
        this.onDismissInstoreReminderPopup = SnapshotStateKt.f(null);
        this.onSetDeliveryAddressClick = SnapshotStateKt.f(null);
    }
}
