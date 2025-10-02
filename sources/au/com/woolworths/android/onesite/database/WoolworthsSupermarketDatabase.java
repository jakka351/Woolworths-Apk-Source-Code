package au.com.woolworths.android.onesite.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;

@StabilityInferred
@TypeConverters
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/database/WoolworthsSupermarketDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Database
/* loaded from: classes3.dex */
public abstract class WoolworthsSupermarketDatabase extends RoomDatabase {
    public abstract RecentSearchDao t();
}
