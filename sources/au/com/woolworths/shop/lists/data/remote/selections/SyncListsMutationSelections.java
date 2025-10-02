package au.com.woolworths.shop.lists.data.remote.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.SyncListsResponse;
import au.com.woolworths.shop.lists.data.remote.fragment.selections.SyncListsResponseFragmentSelections;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/selections/SyncListsMutationSelections;", "", "<init>", "()V", "__syncLists", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__root", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncListsMutationSelections {

    @NotNull
    public static final SyncListsMutationSelections INSTANCE = new SyncListsMutationSelections();

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __syncLists;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("SyncListsResponse", CollectionsKt.Q("SyncListsResponse"));
        builder.b(SyncListsResponseFragmentSelections.INSTANCE.get__root());
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __syncLists = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("syncLists", CompiledGraphQL.b(SyncListsResponse.f11958a));
        new CompiledArgument.Builder(Mutation.i);
        builder2.d = a.v();
        builder2.e = listR;
        __root = CollectionsKt.Q(builder2.c());
    }

    private SyncListsMutationSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
