package com.woolworths.rewards.redemptionsettings.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingIcon;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsRedemptionSettingIcon_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter;", "", "RedemptionSettingsListFields", "TwoFactorAuth", "Item", "ConfirmationMessage", "Cta", "Cta1", "Actions", "Item1", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionSettingsListFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$Actions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Actions;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Actions implements Adapter<RedemptionSettingsListFields.Actions> {

        /* renamed from: a, reason: collision with root package name */
        public static final Actions f21107a = new Actions();
        public static final List b = CollectionsKt.R("title", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f21112a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new RedemptionSettingsListFields.Actions(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsListFields.Actions value = (RedemptionSettingsListFields.Actions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21100a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f21112a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$ConfirmationMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$ConfirmationMessage;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConfirmationMessage implements Adapter<RedemptionSettingsListFields.ConfirmationMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ConfirmationMessage f21108a = new ConfirmationMessage();
        public static final List b = CollectionsKt.R("title", "message", "buttonLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "message");
                throw null;
            }
            if (str3 != null) {
                return new RedemptionSettingsListFields.ConfirmationMessage(str, str2, str3);
            }
            Assertions.a(reader, "buttonLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsListFields.ConfirmationMessage value = (RedemptionSettingsListFields.ConfirmationMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.i.toJson(writer, customScalarAdapters, value.f21101a);
            writer.F1("message");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("buttonLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Cta;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<RedemptionSettingsListFields.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f21109a = new Cta();
        public static final List b = CollectionsKt.R("iconUrl", "cta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RedemptionSettingsListFields.Cta1 cta1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    cta1 = (RedemptionSettingsListFields.Cta1) Adapters.c(Cta1.f21110a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (cta1 != null) {
                return new RedemptionSettingsListFields.Cta(str, cta1);
            }
            Assertions.a(reader, "cta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsListFields.Cta value = (RedemptionSettingsListFields.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21102a);
            writer.F1("cta");
            Adapters.c(Cta1.f21110a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$Cta1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Cta1;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta1 implements Adapter<RedemptionSettingsListFields.Cta1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta1 f21110a = new Cta1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new RedemptionSettingsListFields.Cta1(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsListFields.Cta1 value = (RedemptionSettingsListFields.Cta1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21103a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Item;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<RedemptionSettingsListFields.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f21111a = new Item();
        public static final List b = CollectionsKt.R("isSelected", BarcodePickDeserializer.FIELD_ICON, "title", "body", "confirmationMessages", "isChangeEnabled", "cta");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            RewardsRedemptionSettingIcon rewardsRedemptionSettingIconA = null;
            String str = null;
            String str2 = null;
            List list = null;
            Boolean bool2 = null;
            RedemptionSettingsListFields.Cta cta = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        rewardsRedemptionSettingIconA = RewardsRedemptionSettingIcon_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(ConfirmationMessage.f21108a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool2 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        cta = (RedemptionSettingsListFields.Cta) Adapters.b(Adapters.c(Cta.f21109a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (bool == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        boolean zBooleanValue = bool.booleanValue();
                        if (rewardsRedemptionSettingIconA == null) {
                            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                            throw null;
                        }
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 != null) {
                            return new RedemptionSettingsListFields.Item(zBooleanValue, rewardsRedemptionSettingIconA, str, str2, list, bool2, cta);
                        }
                        Assertions.a(reader, "body");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsListFields.Item value = (RedemptionSettingsListFields.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("isSelected");
            d.B(value.f21104a, Adapters.f, writer, customScalarAdapters, BarcodePickDeserializer.FIELD_ICON);
            RewardsRedemptionSettingIcon_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("confirmationMessages");
            Adapters.b(Adapters.a(Adapters.c(ConfirmationMessage.f21108a, false))).toJson(writer, customScalarAdapters, value.e);
            writer.F1("isChangeEnabled");
            Adapters.l.toJson(writer, customScalarAdapters, value.f);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f21109a, false)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Item1;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<RedemptionSettingsListFields.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f21112a = new Item1();
        public static final List b = CollectionsKt.R("iconUrl", "title", "body", "actionUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "body");
                throw null;
            }
            if (str4 != null) {
                return new RedemptionSettingsListFields.Item1(str, str2, str3, str4);
            }
            Assertions.a(reader, "actionUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsListFields.Item1 value = (RedemptionSettingsListFields.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21105a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$RedemptionSettingsListFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RedemptionSettingsListFields implements Adapter<com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21113a = CollectionsKt.R("twoFactorAuth", "items", "actions");

        public static com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RedemptionSettingsListFields.TwoFactorAuth twoFactorAuth = null;
            ArrayList arrayListFromJson = null;
            RedemptionSettingsListFields.Actions actions = null;
            while (true) {
                int iO2 = reader.o2(f21113a);
                if (iO2 == 0) {
                    twoFactorAuth = (RedemptionSettingsListFields.TwoFactorAuth) Adapters.b(Adapters.c(TwoFactorAuth.f21114a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f21111a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    actions = (RedemptionSettingsListFields.Actions) Adapters.b(Adapters.c(Actions.f21107a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields(twoFactorAuth, arrayListFromJson, actions);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("twoFactorAuth");
            Adapters.b(Adapters.c(TwoFactorAuth.f21114a, false)).toJson(writer, customScalarAdapters, value.f21099a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f21111a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("actions");
            Adapters.b(Adapters.c(Actions.f21107a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFieldsImpl_ResponseAdapter$TwoFactorAuth;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$TwoFactorAuth;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TwoFactorAuth implements Adapter<RedemptionSettingsListFields.TwoFactorAuth> {

        /* renamed from: a, reason: collision with root package name */
        public static final TwoFactorAuth f21114a = new TwoFactorAuth();
        public static final List b = CollectionsKt.Q("stepUpUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RedemptionSettingsListFields.TwoFactorAuth(str);
            }
            Assertions.a(reader, "stepUpUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsListFields.TwoFactorAuth value = (RedemptionSettingsListFields.TwoFactorAuth) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("stepUpUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21106a);
        }
    }
}
