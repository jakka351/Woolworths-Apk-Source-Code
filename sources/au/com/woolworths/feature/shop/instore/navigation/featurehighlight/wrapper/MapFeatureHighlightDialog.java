package au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.shop.instore.navigation.databinding.FragmentFeatureHighlightBinding;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/featurehighlight/wrapper/MapFeatureHighlightDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapFeatureHighlightDialog extends DialogFragment {
    public FragmentFeatureHighlightBinding d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/featurehighlight/wrapper/MapFeatureHighlightDialog$Companion;", "", "", "TAG", "Ljava/lang/String;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), R.style.TransparentAlertDialog);
        View viewInflate = getLayoutInflater().inflate(R.layout.fragment_feature_highlight, (ViewGroup) null, false);
        MapFeatureHighlightView mapFeatureHighlightView = (MapFeatureHighlightView) ViewBindings.a(R.id.highlight, viewInflate);
        if (mapFeatureHighlightView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.highlight)));
        }
        this.d = new FragmentFeatureHighlightBinding((FrameLayout) viewInflate, mapFeatureHighlightView);
        final int i = 0;
        mapFeatureHighlightView.setCloseListener(new Function0(this) { // from class: au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper.a
            public final /* synthetic */ MapFeatureHighlightDialog e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        this.e.dismiss();
                        break;
                    default:
                        this.e.dismiss();
                        break;
                }
                return Unit.f24250a;
            }
        });
        FragmentFeatureHighlightBinding fragmentFeatureHighlightBinding = this.d;
        if (fragmentFeatureHighlightBinding != null) {
            final int i2 = 1;
            fragmentFeatureHighlightBinding.e.setAcceptListener(new Function0(this) { // from class: au.com.woolworths.feature.shop.instore.navigation.featurehighlight.wrapper.a
                public final /* synthetic */ MapFeatureHighlightDialog e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            this.e.dismiss();
                            break;
                        default:
                            this.e.dismiss();
                            break;
                    }
                    return Unit.f24250a;
                }
            });
        }
        FragmentFeatureHighlightBinding fragmentFeatureHighlightBinding2 = this.d;
        builder.setView(fragmentFeatureHighlightBinding2 != null ? fragmentFeatureHighlightBinding2.d : null);
        AlertDialog alertDialogCreate = builder.create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.d = null;
        super.onDestroyView();
    }
}
