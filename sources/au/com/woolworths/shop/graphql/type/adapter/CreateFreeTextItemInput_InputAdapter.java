package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.CreateFreeTextItemInput;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/CreateFreeTextItemInput_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/CreateFreeTextItemInput;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreateFreeTextItemInput_InputAdapter implements Adapter<CreateFreeTextItemInput> {

    /* renamed from: a, reason: collision with root package name */
    public static final CreateFreeTextItemInput_InputAdapter f12059a = new CreateFreeTextItemInput_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        CreateFreeTextItemInput value = (CreateFreeTextItemInput) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        writer.F1(TextBundle.TEXT_ENTRY);
        Adapters.f13493a.toJson(writer, customScalarAdapters, value.f11297a);
        writer.F1("checked");
        Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.b));
        Optional.Present present = value.c;
        writer.F1("referenceId");
        Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, present);
    }
}
