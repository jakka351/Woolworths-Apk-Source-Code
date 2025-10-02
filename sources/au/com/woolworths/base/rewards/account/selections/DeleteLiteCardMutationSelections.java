package au.com.woolworths.base.rewards.account.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.rewards.graphql.type.DeleteLiteCard;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/base/rewards/account/selections/DeleteLiteCardMutationSelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__deleteLiteCard", "Ljava/util/List;", "__root", "get__root", "()Ljava/util/List;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteLiteCardMutationSelections {
    public static final int $stable;

    @NotNull
    public static final DeleteLiteCardMutationSelections INSTANCE = new DeleteLiteCardMutationSelections();

    @NotNull
    private static final List<CompiledSelection> __deleteLiteCard;

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        List<CompiledSelection> listQ = CollectionsKt.Q(new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f9613a)).c());
        __deleteLiteCard = listQ;
        CompiledField.Builder builder = new CompiledField.Builder("deleteLiteCard", DeleteLiteCard.f9496a);
        new CompiledArgument.Builder(Mutation.d);
        builder.d = a.v();
        builder.e = listQ;
        __root = CollectionsKt.Q(builder.c());
        $stable = 8;
    }

    private DeleteLiteCardMutationSelections() {
    }
}
