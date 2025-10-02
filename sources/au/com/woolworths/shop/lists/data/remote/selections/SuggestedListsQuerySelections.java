package au.com.woolworths.shop.lists.data.remote.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.SuggestedListItem;
import au.com.woolworths.shop.graphql.type.SuggestedLists;
import au.com.woolworths.shop.lists.data.remote.SuggestedListsQuery;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/selections/SuggestedListsQuerySelections;", "", "<init>", "()V", "__items", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__suggestedLists", "__root", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedListsQuerySelections {

    @NotNull
    public static final SuggestedListsQuerySelections INSTANCE = new SuggestedListsQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __items;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __suggestedLists;

    static {
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME, CompiledGraphQL.b(customScalarType2)).c(), d.g("image", customScalarType2));
        __items = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("totalItemCount", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("nextPage", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("items", a.f(SuggestedListItem.f11952a));
        builder.e = listR;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldG, builder.c());
        __suggestedLists = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder(SuggestedListsQuery.OPERATION_NAME, SuggestedLists.f11953a);
        new CompiledArgument.Builder(Query.z1);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.y1);
        builder2.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder2.e = listR2;
        __root = CollectionsKt.Q(builder2.c());
    }

    private SuggestedListsQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
