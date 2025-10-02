package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import au.com.woolworths.shop.lists.data.utils.ListsDataUtilsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ TextListItemEntity e;

    public /* synthetic */ c(TextListItemEntity textListItemEntity, int i) {
        this.d = i;
        this.e = textListItemEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return this.e;
            default:
                TextListItemEntity textListItemEntity = (TextListItemEntity) obj;
                TextListItemEntity textListItemEntity2 = this.e;
                return textListItemEntity == null ? TextListItemEntity.copy$default(textListItemEntity2, null, null, ListsDataUtilsKt.b(), 0L, null, 0L, false, false, false, null, 1019, null) : TextListItemEntity.copy$default(textListItemEntity2, textListItemEntity.getId(), null, textListItemEntity.getLocalCreatedAt(), 0L, null, 0L, false, false, false, null, 1018, null);
        }
    }
}
