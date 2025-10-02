package au.com.woolworths.android.onesite.modules.checkout;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.checkout.ConfirmDialogFragment;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigipayActions;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ConfirmDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "SourceScreens", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ConfirmDialogFragment extends Hilt_ConfirmDialogFragment {
    public AnalyticsManager i;
    public Action j;
    public SourceScreens k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ConfirmDialogFragment$Companion;", "", "", "DIALOG_INFORMATION", "Ljava/lang/String;", "TAG", "ConfirmationInfo", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ConfirmDialogFragment$Companion$ConfirmationInfo;", "Landroid/os/Parcelable;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfirmationInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ConfirmationInfo> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final SourceScreens f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConfirmationInfo> {
                @Override // android.os.Parcelable.Creator
                public final ConfirmationInfo createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ConfirmationInfo(parcel.readString(), parcel.readString(), SourceScreens.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ConfirmationInfo[] newArray(int i) {
                    return new ConfirmationInfo[i];
                }
            }

            public ConfirmationInfo(String actionButtonText, String content, SourceScreens sourceScreens) {
                Intrinsics.h(actionButtonText, "actionButtonText");
                Intrinsics.h(content, "content");
                Intrinsics.h(sourceScreens, "sourceScreens");
                this.d = actionButtonText;
                this.e = content;
                this.f = sourceScreens;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmationInfo)) {
                    return false;
                }
                ConfirmationInfo confirmationInfo = (ConfirmationInfo) obj;
                return Intrinsics.c(this.d, confirmationInfo.d) && Intrinsics.c(this.e, confirmationInfo.e) && this.f == confirmationInfo.f;
            }

            public final int hashCode() {
                return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
            }

            public final String toString() {
                StringBuilder sbV = YU.a.v("ConfirmationInfo(actionButtonText=", this.d, ", content=", this.e, ", sourceScreens=");
                sbV.append(this.f);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f.name());
            }
        }

        public static ConfirmDialogFragment a(String str, String str2, Action action, SourceScreens sourceScreen) {
            Intrinsics.h(sourceScreen, "sourceScreen");
            ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("dialog_information", new ConfirmationInfo(str, str2, sourceScreen));
            confirmDialogFragment.setArguments(bundle);
            confirmDialogFragment.j = action;
            return confirmDialogFragment;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ConfirmDialogFragment$SourceScreens;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SourceScreens {
        public static final SourceScreens f;
        public static final SourceScreens g;
        public static final SourceScreens h;
        public static final SourceScreens i;
        public static final /* synthetic */ SourceScreens[] j;
        public static final /* synthetic */ EnumEntries k;
        public final au.com.woolworths.android.onesite.analytics.Action d;
        public final au.com.woolworths.android.onesite.analytics.Action e;

        static {
            SourceScreens sourceScreens = new SourceScreens("UNLINK_PAYPAL", 0, DigipayActions.A, DigipayActions.z);
            f = sourceScreens;
            SourceScreens sourceScreens2 = new SourceScreens("DELETE_NEW_GIFT_CARD", 1, DigipayActions.n, DigipayActions.o);
            g = sourceScreens2;
            SourceScreens sourceScreens3 = new SourceScreens("DELETE_SAVED_GIFT_CARD", 2, DigipayActions.k, DigipayActions.l);
            h = sourceScreens3;
            SourceScreens sourceScreens4 = new SourceScreens("DELETE_SAVED_CREDIT_CARD", 3, DigipayActions.u, DigipayActions.v);
            i = sourceScreens4;
            SourceScreens[] sourceScreensArr = {sourceScreens, sourceScreens2, sourceScreens3, sourceScreens4};
            j = sourceScreensArr;
            k = EnumEntriesKt.a(sourceScreensArr);
        }

        public SourceScreens(String str, int i2, DigipayActions digipayActions, DigipayActions digipayActions2) {
            this.d = digipayActions;
            this.e = digipayActions2;
        }

        public static SourceScreens valueOf(String str) {
            return (SourceScreens) Enum.valueOf(SourceScreens.class, str);
        }

        public static SourceScreens[] values() {
            return (SourceScreens[]) j.clone();
        }
    }

    public final void Q1(FragmentManager fragmentManager) {
        FragmentTransaction fragmentTransactionE = fragmentManager.e();
        fragmentTransactionE.g(0, this, "Checkout.ConfirmDialogFragment", 1);
        fragmentTransactionE.e();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        Companion.ConfirmationInfo confirmationInfo = arguments != null ? (Companion.ConfirmationInfo) arguments.getParcelable("dialog_information") : null;
        if (confirmationInfo == null) {
            throw new IllegalStateException("Arguments are required. Please provide display strings.");
        }
        SourceScreens sourceScreens = confirmationInfo.f;
        Intrinsics.h(sourceScreens, "<set-?>");
        this.k = sourceScreens;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), R.style.AlertDialogStyle);
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.g(layoutInflater, "getLayoutInflater(...)");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_confirm_dialog, (ViewGroup) null);
        builder.setView(viewInflate);
        ((TextView) viewInflate.findViewById(R.id.confirmContentTextView)).setText(confirmationInfo.e);
        Button button = (Button) viewInflate.findViewById(R.id.actionButton);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.a
            public final /* synthetic */ ConfirmDialogFragment e;

            {
                this.e = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        ConfirmDialogFragment confirmDialogFragment = this.e;
                        Callback.g(view);
                        try {
                            AnalyticsManager analyticsManager = confirmDialogFragment.i;
                            if (analyticsManager == null) {
                                Intrinsics.p("analyticsManager");
                                throw null;
                            }
                            ConfirmDialogFragment.SourceScreens sourceScreens2 = confirmDialogFragment.k;
                            if (sourceScreens2 == null) {
                                Intrinsics.p("sourceScreen");
                                throw null;
                            }
                            analyticsManager.c(sourceScreens2.e);
                            try {
                                try {
                                    Action action = confirmDialogFragment.j;
                                    if (action != null) {
                                        action.run();
                                    }
                                } catch (Exception e) {
                                    Timber.f27013a.f(e);
                                }
                                confirmDialogFragment.dismissAllowingStateLoss();
                                Callback.h();
                                return;
                            } catch (Throwable th) {
                                confirmDialogFragment.dismissAllowingStateLoss();
                                throw th;
                            }
                        } finally {
                        }
                    default:
                        ConfirmDialogFragment confirmDialogFragment2 = this.e;
                        Callback.g(view);
                        try {
                            AnalyticsManager analyticsManager2 = confirmDialogFragment2.i;
                            if (analyticsManager2 == null) {
                                Intrinsics.p("analyticsManager");
                                throw null;
                            }
                            ConfirmDialogFragment.SourceScreens sourceScreens3 = confirmDialogFragment2.k;
                            if (sourceScreens3 == null) {
                                Intrinsics.p("sourceScreen");
                                throw null;
                            }
                            analyticsManager2.c(sourceScreens3.d);
                            confirmDialogFragment2.dismissAllowingStateLoss();
                            Callback.h();
                            return;
                        } finally {
                        }
                }
            }
        });
        button.setText(confirmationInfo.d);
        final int i2 = 1;
        ((Button) viewInflate.findViewById(R.id.cancelButton)).setOnClickListener(new View.OnClickListener(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.a
            public final /* synthetic */ ConfirmDialogFragment e;

            {
                this.e = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ConfirmDialogFragment confirmDialogFragment = this.e;
                        Callback.g(view);
                        try {
                            AnalyticsManager analyticsManager = confirmDialogFragment.i;
                            if (analyticsManager == null) {
                                Intrinsics.p("analyticsManager");
                                throw null;
                            }
                            ConfirmDialogFragment.SourceScreens sourceScreens2 = confirmDialogFragment.k;
                            if (sourceScreens2 == null) {
                                Intrinsics.p("sourceScreen");
                                throw null;
                            }
                            analyticsManager.c(sourceScreens2.e);
                            try {
                                try {
                                    Action action = confirmDialogFragment.j;
                                    if (action != null) {
                                        action.run();
                                    }
                                } catch (Exception e) {
                                    Timber.f27013a.f(e);
                                }
                                confirmDialogFragment.dismissAllowingStateLoss();
                                Callback.h();
                                return;
                            } catch (Throwable th) {
                                confirmDialogFragment.dismissAllowingStateLoss();
                                throw th;
                            }
                        } finally {
                        }
                    default:
                        ConfirmDialogFragment confirmDialogFragment2 = this.e;
                        Callback.g(view);
                        try {
                            AnalyticsManager analyticsManager2 = confirmDialogFragment2.i;
                            if (analyticsManager2 == null) {
                                Intrinsics.p("analyticsManager");
                                throw null;
                            }
                            ConfirmDialogFragment.SourceScreens sourceScreens3 = confirmDialogFragment2.k;
                            if (sourceScreens3 == null) {
                                Intrinsics.p("sourceScreen");
                                throw null;
                            }
                            analyticsManager2.c(sourceScreens3.d);
                            confirmDialogFragment2.dismissAllowingStateLoss();
                            Callback.h();
                            return;
                        } finally {
                        }
                }
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        Intrinsics.g(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.j = null;
        super.onDetach();
    }
}
