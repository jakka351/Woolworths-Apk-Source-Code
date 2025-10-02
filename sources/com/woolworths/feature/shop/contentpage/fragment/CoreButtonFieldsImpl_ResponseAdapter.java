package com.woolworths.feature.shop.contentpage.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.CoreButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.contentpage.fragment.ActionFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.CoreButtonFields;
import com.woolworths.feature.shop.contentpage.fragment.CoreIconFieldsImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFieldsImpl_ResponseAdapter;", "", "CoreButtonFields", "CoreButtonLeadingIcon", "CoreButtonTrailingIcon", "CoreButtonAction", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoreButtonFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFieldsImpl_ResponseAdapter$CoreButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields$CoreButtonAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonAction implements Adapter<CoreButtonFields.CoreButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreButtonAction f19750a = new CoreButtonAction();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreButtonFields.CoreButtonAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreButtonFields.CoreButtonAction value = (CoreButtonFields.CoreButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19747a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFieldsImpl_ResponseAdapter$CoreButtonFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonFields implements Adapter<com.woolworths.feature.shop.contentpage.fragment.CoreButtonFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19751a = CollectionsKt.R("coreButtonStyle", "coreButtonLabel", "coreButtonLeadingIcon", "coreButtonTrailingIcon", "coreButtonAction", "coreButtonEnabled");

        public static com.woolworths.feature.shop.contentpage.fragment.CoreButtonFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            CoreButtonStyle coreButtonStyleA = null;
            String str = null;
            CoreButtonFields.CoreButtonLeadingIcon coreButtonLeadingIcon = null;
            CoreButtonFields.CoreButtonTrailingIcon coreButtonTrailingIcon = null;
            CoreButtonFields.CoreButtonAction coreButtonAction = null;
            while (true) {
                int iO2 = reader.o2(f19751a);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        bool = bool2;
                        coreButtonLeadingIcon = (CoreButtonFields.CoreButtonLeadingIcon) Adapters.b(Adapters.c(CoreButtonLeadingIcon.f19752a, true)).fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        bool = bool2;
                        coreButtonTrailingIcon = (CoreButtonFields.CoreButtonTrailingIcon) Adapters.b(Adapters.c(CoreButtonTrailingIcon.f19753a, true)).fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 4) {
                        bool = bool2;
                        coreButtonAction = (CoreButtonFields.CoreButtonAction) Adapters.c(CoreButtonAction.f19750a, true).fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 5) {
                            break;
                        }
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                    }
                    bool2 = bool;
                } else {
                    coreButtonStyleA = CoreButtonStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            Boolean bool3 = bool2;
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
            if (bool3 != null) {
                return new com.woolworths.feature.shop.contentpage.fragment.CoreButtonFields(coreButtonStyleA, str, coreButtonLeadingIcon, coreButtonTrailingIcon, coreButtonAction, bool3.booleanValue());
            }
            Assertions.a(reader, "coreButtonEnabled");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.feature.shop.contentpage.fragment.CoreButtonFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreButtonStyle");
            CoreButtonStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f19746a);
            writer.F1("coreButtonLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("coreButtonLeadingIcon");
            Adapters.b(Adapters.c(CoreButtonLeadingIcon.f19752a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("coreButtonTrailingIcon");
            Adapters.b(Adapters.c(CoreButtonTrailingIcon.f19753a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("coreButtonAction");
            Adapters.c(CoreButtonAction.f19750a, true).toJson(writer, customScalarAdapters, value.e);
            writer.F1("coreButtonEnabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.feature.shop.contentpage.fragment.CoreButtonFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFieldsImpl_ResponseAdapter$CoreButtonLeadingIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields$CoreButtonLeadingIcon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonLeadingIcon implements Adapter<CoreButtonFields.CoreButtonLeadingIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreButtonLeadingIcon f19752a = new CoreButtonLeadingIcon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CoreIconFields coreIconFieldsA = CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreButtonFields.CoreButtonLeadingIcon(str, coreIconFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreButtonFields.CoreButtonLeadingIcon value = (CoreButtonFields.CoreButtonLeadingIcon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19748a);
            List list = CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.f19755a;
            CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFieldsImpl_ResponseAdapter$CoreButtonTrailingIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/CoreButtonFields$CoreButtonTrailingIcon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CoreButtonTrailingIcon implements Adapter<CoreButtonFields.CoreButtonTrailingIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final CoreButtonTrailingIcon f19753a = new CoreButtonTrailingIcon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CoreIconFields coreIconFieldsA = CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new CoreButtonFields.CoreButtonTrailingIcon(str, coreIconFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CoreButtonFields.CoreButtonTrailingIcon value = (CoreButtonFields.CoreButtonTrailingIcon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19749a);
            List list = CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.f19755a;
            CoreIconFieldsImpl_ResponseAdapter.CoreIconFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
