package au.com.woolworths.foundation.shop.prompt.handler.fragment;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OnBottomSheet", "OnPromptAlert", "BottomSheetButton", "CoreButtonAction", "AlertPrimaryCta", "Action", "AlertSecondaryCta", "Action1", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Prompts implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f8866a;
    public final OnBottomSheet b;
    public final OnPromptAlert c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$Action;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f8867a;
        public final String b;

        public Action(ActionType actionType, String str) {
            this.f8867a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f8867a == action.f8867a && Intrinsics.c(this.b, action.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8867a.hashCode() * 31);
        }

        public final String toString() {
            return "Action(type=" + this.f8867a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$Action1;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f8868a;
        public final String b;

        public Action1(ActionType actionType, String str) {
            this.f8868a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action1)) {
                return false;
            }
            Action1 action1 = (Action1) obj;
            return this.f8868a == action1.f8868a && Intrinsics.c(this.b, action1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8868a.hashCode() * 31);
        }

        public final String toString() {
            return "Action1(type=" + this.f8868a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$AlertPrimaryCta;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AlertPrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f8869a;
        public final Action b;

        public AlertPrimaryCta(String str, Action action) {
            this.f8869a = str;
            this.b = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlertPrimaryCta)) {
                return false;
            }
            AlertPrimaryCta alertPrimaryCta = (AlertPrimaryCta) obj;
            return Intrinsics.c(this.f8869a, alertPrimaryCta.f8869a) && Intrinsics.c(this.b, alertPrimaryCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8869a.hashCode() * 31);
        }

        public final String toString() {
            return "AlertPrimaryCta(label=" + this.f8869a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$AlertSecondaryCta;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AlertSecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f8870a;
        public final Action1 b;

        public AlertSecondaryCta(String str, Action1 action1) {
            this.f8870a = str;
            this.b = action1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlertSecondaryCta)) {
                return false;
            }
            AlertSecondaryCta alertSecondaryCta = (AlertSecondaryCta) obj;
            return Intrinsics.c(this.f8870a, alertSecondaryCta.f8870a) && Intrinsics.c(this.b, alertSecondaryCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8870a.hashCode() * 31);
        }

        public final String toString() {
            return "AlertSecondaryCta(label=" + this.f8870a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$BottomSheetButton;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheetButton {

        /* renamed from: a, reason: collision with root package name */
        public final CoreButtonStyle f8871a;
        public final String b;
        public final CoreButtonAction c;
        public final boolean d;

        public BottomSheetButton(CoreButtonStyle coreButtonStyle, String str, CoreButtonAction coreButtonAction, boolean z) {
            this.f8871a = coreButtonStyle;
            this.b = str;
            this.c = coreButtonAction;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheetButton)) {
                return false;
            }
            BottomSheetButton bottomSheetButton = (BottomSheetButton) obj;
            return this.f8871a == bottomSheetButton.f8871a && Intrinsics.c(this.b, bottomSheetButton.b) && Intrinsics.c(this.c, bottomSheetButton.c) && this.d == bottomSheetButton.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + b.c(this.f8871a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "BottomSheetButton(coreButtonStyle=" + this.f8871a + ", coreButtonLabel=" + this.b + ", coreButtonAction=" + this.c + ", coreButtonEnabled=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$CoreButtonAction;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CoreButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f8872a;
        public final String b;

        public CoreButtonAction(ActionType actionType, String str) {
            this.f8872a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoreButtonAction)) {
                return false;
            }
            CoreButtonAction coreButtonAction = (CoreButtonAction) obj;
            return this.f8872a == coreButtonAction.f8872a && Intrinsics.c(this.b, coreButtonAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8872a.hashCode() * 31);
        }

        public final String toString() {
            return "CoreButtonAction(type=" + this.f8872a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$OnBottomSheet;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f8873a;
        public final String b;
        public final ArrayList c;

        public OnBottomSheet(String str, String str2, ArrayList arrayList) {
            this.f8873a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBottomSheet)) {
                return false;
            }
            OnBottomSheet onBottomSheet = (OnBottomSheet) obj;
            return this.f8873a.equals(onBottomSheet.f8873a) && this.b.equals(onBottomSheet.b) && this.c.equals(onBottomSheet.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f8873a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.q(")", YU.a.v("OnBottomSheet(bottomSheetTitle=", this.f8873a, ", bottomSheetBody=", this.b, ", bottomSheetButtons="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$OnPromptAlert;", "", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromptAlert {

        /* renamed from: a, reason: collision with root package name */
        public final String f8874a;
        public final String b;
        public final AlertPrimaryCta c;
        public final AlertSecondaryCta d;

        public OnPromptAlert(String str, String str2, AlertPrimaryCta alertPrimaryCta, AlertSecondaryCta alertSecondaryCta) {
            this.f8874a = str;
            this.b = str2;
            this.c = alertPrimaryCta;
            this.d = alertSecondaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromptAlert)) {
                return false;
            }
            OnPromptAlert onPromptAlert = (OnPromptAlert) obj;
            return Intrinsics.c(this.f8874a, onPromptAlert.f8874a) && Intrinsics.c(this.b, onPromptAlert.b) && Intrinsics.c(this.c, onPromptAlert.c) && Intrinsics.c(this.d, onPromptAlert.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.c(this.f8874a.hashCode() * 31, 31, this.b)) * 31;
            AlertSecondaryCta alertSecondaryCta = this.d;
            return iHashCode + (alertSecondaryCta == null ? 0 : alertSecondaryCta.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnPromptAlert(alertTitle=", this.f8874a, ", alertBody=", this.b, ", alertPrimaryCta=");
            sbV.append(this.c);
            sbV.append(", alertSecondaryCta=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public Prompts(String __typename, OnBottomSheet onBottomSheet, OnPromptAlert onPromptAlert) {
        Intrinsics.h(__typename, "__typename");
        this.f8866a = __typename;
        this.b = onBottomSheet;
        this.c = onPromptAlert;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Prompts)) {
            return false;
        }
        Prompts prompts = (Prompts) obj;
        return Intrinsics.c(this.f8866a, prompts.f8866a) && Intrinsics.c(this.b, prompts.b) && Intrinsics.c(this.c, prompts.c);
    }

    public final int hashCode() {
        int iHashCode = this.f8866a.hashCode() * 31;
        OnBottomSheet onBottomSheet = this.b;
        int iHashCode2 = (iHashCode + (onBottomSheet == null ? 0 : onBottomSheet.hashCode())) * 31;
        OnPromptAlert onPromptAlert = this.c;
        return iHashCode2 + (onPromptAlert != null ? onPromptAlert.hashCode() : 0);
    }

    public final String toString() {
        return "Prompts(__typename=" + this.f8866a + ", onBottomSheet=" + this.b + ", onPromptAlert=" + this.c + ")";
    }
}
