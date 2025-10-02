package au.com.woolworths.shop.lists.data.remote.fragment.selections;

import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/selections/DeletedItemFragmentSelections;", "", "<init>", "()V", "__root", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeletedItemFragmentSelections {

    @NotNull
    public static final DeletedItemFragmentSelections INSTANCE = new DeletedItemFragmentSelections();

    @NotNull
    private static final List<CompiledSelection> __root = CollectionsKt.R(new CompiledField.Builder("timestamp", CompiledGraphQL.b(GraphQLFloat.f11440a)).c(), new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c());

    private DeletedItemFragmentSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
