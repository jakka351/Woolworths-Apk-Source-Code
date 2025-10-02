package au.com.woolworths.foundation.shop.prompt.handler.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter;", "", "Prompts", "OnBottomSheet", "BottomSheetButton", "CoreButtonAction", "OnPromptAlert", "AlertPrimaryCta", "Action", "AlertSecondaryCta", "Action1", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromptsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$Action;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<Prompts.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f8875a = new Action();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new Prompts.Action(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Prompts.Action value = (Prompts.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f8867a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$Action1;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<Prompts.Action1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action1 f8876a = new Action1();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new Prompts.Action1(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Prompts.Action1 value = (Prompts.Action1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f8868a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$AlertPrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$AlertPrimaryCta;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AlertPrimaryCta implements Adapter<Prompts.AlertPrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final AlertPrimaryCta f8877a = new AlertPrimaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Prompts.Action action = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    action = (Prompts.Action) Adapters.c(Action.f8875a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (action != null) {
                return new Prompts.AlertPrimaryCta(str, action);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Prompts.AlertPrimaryCta value = (Prompts.AlertPrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8869a);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f8875a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$AlertSecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$AlertSecondaryCta;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AlertSecondaryCta implements Adapter<Prompts.AlertSecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final AlertSecondaryCta f8878a = new AlertSecondaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Prompts.Action1 action1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    action1 = (Prompts.Action1) Adapters.c(Action1.f8876a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (action1 != null) {
                return new Prompts.AlertSecondaryCta(str, action1);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Prompts.AlertSecondaryCta value = (Prompts.AlertSecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8870a);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action1.f8876a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$BottomSheetButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$BottomSheetButton;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheetButton implements Adapter<Prompts.BottomSheetButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final BottomSheetButton f8879a = new BottomSheetButton();
        public static final List b = CollectionsKt.R("coreButtonStyle", "coreButtonLabel", "coreButtonAction", "coreButtonEnabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CoreButtonStyle coreButtonStyleA = null;
            String str = null;
            Prompts.CoreButtonAction coreButtonAction = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    coreButtonStyleA = CoreButtonStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreButtonAction = (Prompts.CoreButtonAction) Adapters.c(CoreButtonAction.f8880a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (coreButtonStyleA == null) {
                Assertions.a(reader, "coreButtonStyle");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "coreButtonLabel");
                throw null;
            }
            if (coreButtonAction == null) {
                Assertions.a(reader, "coreButtonAction");
                throw null;
            }
            if (bool != null) {
                return new Prompts.BottomSheetButton(coreButtonStyleA, str, coreButtonAction, bool.booleanValue());
            }
            Assertions.a(reader, "coreButtonEnabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Prompts.BottomSheetButton value = (Prompts.BottomSheetButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreButtonStyle");
            CoreButtonStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f8871a);
            writer.F1("coreButtonLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("coreButtonAction");
            Adapters.c(CoreButtonAction.f8880a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("coreButtonEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$CoreButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$CoreButtonAction;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonAction implements Adapter<Prompts.CoreButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreButtonAction f8880a = new CoreButtonAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new Prompts.CoreButtonAction(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            Prompts.CoreButtonAction value = (Prompts.CoreButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f8872a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$OnBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$OnBottomSheet;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBottomSheet implements Adapter<Prompts.OnBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8881a = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "bottomSheetButtons");

        public static Prompts.OnBottomSheet a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f8881a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(BottomSheetButton.f8879a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bottomSheetTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "bottomSheetBody");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new Prompts.OnBottomSheet(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "bottomSheetButtons");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Prompts.OnBottomSheet value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8873a);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bottomSheetButtons");
            Adapters.a(Adapters.b(Adapters.c(BottomSheetButton.f8879a, false))).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Prompts.OnBottomSheet) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$OnPromptAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts$OnPromptAlert;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromptAlert implements Adapter<Prompts.OnPromptAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8882a = CollectionsKt.R("alertTitle", "alertBody", "alertPrimaryCta", "alertSecondaryCta");

        public static Prompts.OnPromptAlert a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Prompts.AlertPrimaryCta alertPrimaryCta = null;
            Prompts.AlertSecondaryCta alertSecondaryCta = null;
            while (true) {
                int iO2 = reader.o2(f8882a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    alertPrimaryCta = (Prompts.AlertPrimaryCta) Adapters.c(AlertPrimaryCta.f8877a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    alertSecondaryCta = (Prompts.AlertSecondaryCta) Adapters.b(Adapters.c(AlertSecondaryCta.f8878a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "alertTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "alertBody");
                throw null;
            }
            if (alertPrimaryCta != null) {
                return new Prompts.OnPromptAlert(str, str2, alertPrimaryCta, alertSecondaryCta);
            }
            Assertions.a(reader, "alertPrimaryCta");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Prompts.OnPromptAlert value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("alertTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8874a);
            writer.F1("alertBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("alertPrimaryCta");
            Adapters.c(AlertPrimaryCta.f8877a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("alertSecondaryCta");
            Adapters.b(Adapters.c(AlertSecondaryCta.f8878a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (Prompts.OnPromptAlert) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/prompt/handler/fragment/PromptsImpl_ResponseAdapter$Prompts;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/prompt/handler/fragment/Prompts;", "prompt-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Prompts implements Adapter<au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f8883a = CollectionsKt.Q("__typename");

        public static au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Prompts.OnBottomSheet onBottomSheetA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            Prompts.OnPromptAlert onPromptAlertA = null;
            String str = null;
            while (reader.o2(f8883a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BottomSheet"))) {
                reader.o();
                onBottomSheetA = OnBottomSheet.a(reader, customScalarAdapters);
            } else {
                onBottomSheetA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PromptAlert"))) {
                reader.o();
                onPromptAlertA = OnPromptAlert.a(reader, customScalarAdapters);
            }
            return new au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts(str, onBottomSheetA, onPromptAlertA);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f8866a);
            Prompts.OnBottomSheet onBottomSheet = value.b;
            if (onBottomSheet != null) {
                OnBottomSheet.b(writer, customScalarAdapters, onBottomSheet);
            }
            Prompts.OnPromptAlert onPromptAlert = value.c;
            if (onPromptAlert != null) {
                OnPromptAlert.b(writer, customScalarAdapters, onPromptAlert);
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.foundation.shop.prompt.handler.fragment.Prompts) obj);
        }
    }
}
