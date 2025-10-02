package au.com.woolworths.shop.lists.data.remote.fragment.selections;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.CreateListResponse;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ListResponse;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/selections/SyncListsResponseFragmentSelections;", "", "<init>", "()V", "__createdLists", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__updatedLists", "__root", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncListsResponseFragmentSelections {

    @NotNull
    public static final SyncListsResponseFragmentSelections INSTANCE = new SyncListsResponseFragmentSelections();

    @NotNull
    private static final List<CompiledSelection> __createdLists;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __updatedLists;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("timestamp", CompiledGraphQL.b(GraphQLFloat.f11440a)).c();
        CustomScalarType customScalarType = GraphQLID.f11441a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("referenceId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("color", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField.Builder builder = new CompiledField.Builder("isWatching", GraphQLBoolean.f11439a);
        builder.c = a.s("includeWatchlist", false);
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, builder.c());
        __createdLists = listR;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType2)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ListResponse", CollectionsKt.Q("ListResponse"));
        builder2.b(ShoppingListFragmentSelections.INSTANCE.get__root());
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC6, builder2.a());
        __updatedLists = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("createdLists", a.f(CreateListResponse.f11299a));
        builder3.e = listR;
        CompiledField compiledFieldC7 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("updatedLists", a.f(ListResponse.f11536a));
        builder4.e = listR2;
        __root = CollectionsKt.R(compiledFieldC7, builder4.c(), new CompiledField.Builder("deletedLists", a.e(customScalarType)).c());
    }

    private SyncListsResponseFragmentSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
