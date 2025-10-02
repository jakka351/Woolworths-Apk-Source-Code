package au.com.woolworths.feature.shared.receipt.details.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.design.wx.foundation.ThemeContext;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptSavings;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/compose/ReceiptTotalSavedModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReceiptTotalSavedModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public ReceiptTotalSavedModel(final EReceiptSavings eReceiptSavings, final AppIdentifier appIdentifier) {
        Intrinsics.h(appIdentifier, "appIdentifier");
        this.n = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.receipt.details.compose.ReceiptTotalSavedModel$wrappedModel$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[AppIdentifier.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AppIdentifier appIdentifier = AppIdentifier.d;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ThemeContext themeContext;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int iOrdinal = appIdentifier.ordinal();
                    if (iOrdinal == 0) {
                        themeContext = ThemeContext.d;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        themeContext = ThemeContext.e;
                    }
                    final EReceiptSavings eReceiptSavings2 = eReceiptSavings;
                    ThemeKt.c(themeContext, ComposableLambdaKt.c(-844673625, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shared.receipt.details.compose.ReceiptTotalSavedModel$wrappedModel$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                float f = 8;
                                ReceiptTotalSavedUiKt.a(eReceiptSavings2, PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), f, 4, f, BitmapDescriptorFactory.HUE_RED, 8), composer2, 0, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer), composer, 48);
                }
                return Unit.f24250a;
            }
        }, true, 2128280267));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        ComposeView view = (ComposeView) obj;
        Intrinsics.h(view, "view");
        this.n.h(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        return this.n.j(viewGroup);
    }
}
