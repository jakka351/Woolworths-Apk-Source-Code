package com.behaviosec.rl.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.behaviosec.rl.oddoodo;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class BehavioSecCollector {
    public static final int COLLECT_PII_CLEARTEXT = 2;
    public static final int COLLECT_PII_HASHED = 1;
    public static final int COLLECT_PII_NONE = 0;
    public static final int DEBUG_LOG = 3;
    public static final int ERROR_LOG = 6;
    public static final int INFO_LOG = 4;
    public static final int VERBOSE_LOG = 2;
    public static final int WARN_LOG = 5;
    public static int a0061006100610061aa0061 = 1;
    public static int aa006100610061aa0061 = 26;
    public static int aa0061aa0061a0061 = 0;
    public static int aaaaa0061a0061 = 2;
    private final IBehavioSecChunkConnector f00660066ff0066f;
    private final IBehavioSecConnector ff0066ff0066f;
    private final oddoodo fff0066f0066f;

    public static class Builder {
        public static int a006100610061a0061a0061 = 13;
        public static int a0061aa00610061a0061 = 2;
        public static int aaa0061a0061a0061 = 0;
        public static int aaaa00610061a0061 = 1;
        private boolean f00660066006600660066f;
        private boolean f0066006600660066f0066;
        private boolean f006600660066f0066f;
        private Set<String> f006600660066ff0066;
        private boolean f00660066f00660066f;
        private long f00660066f0066f0066;
        private Set<String> f00660066fff0066;
        private boolean f0066f006600660066f;
        private long f0066f00660066f0066;
        private IBehavioSecConnector f0066f0066f0066f;
        private Set<String> f0066f0066ff0066;
        private boolean f0066ff00660066f;
        private IBehavioSecChunkConnector f0066ff0066f0066;
        private boolean f0066ffff0066;
        private int ff0066006600660066f;
        private boolean ff006600660066f0066;
        private boolean ff00660066f0066f;
        private Set<String> ff00660066ff0066;
        private boolean ff0066f00660066f;
        private long ff0066f0066f0066;
        private Set<String> ff0066fff0066;
        private boolean fff006600660066f;
        private long fff00660066f0066;
        private Set<String> fff0066ff0066;
        private boolean ffff00660066f;
        private IBehavioSecFieldCallback ffff0066f0066;
        private String fffff00660066;
        private int ffffff0066;

        private Builder() {
            this.f0066f0066f0066f = null;
            this.ff00660066f0066f = true;
            this.f006600660066f0066f = true;
            this.ffff00660066f = true;
            this.f0066ff00660066f = false;
            this.ff0066f00660066f = false;
            this.f00660066f00660066f = false;
            this.fff006600660066f = false;
            this.f0066f006600660066f = false;
            this.ff0066006600660066f = Integer.MAX_VALUE;
            this.f00660066006600660066f = false;
            this.ffffff0066 = 2;
            this.f0066ffff0066 = false;
            this.ff0066fff0066 = new HashSet();
            this.f00660066fff0066 = new HashSet();
            this.fff0066ff0066 = new HashSet();
            this.f0066f0066ff0066 = new HashSet();
            this.ff00660066ff0066 = new HashSet();
            this.f006600660066ff0066 = new HashSet();
            this.ffff0066f0066 = null;
            this.f0066ff0066f0066 = null;
            this.ff0066f0066f0066 = -1L;
            this.f00660066f0066f0066 = -1L;
            this.fff00660066f0066 = -1L;
            this.f0066f00660066f0066 = -1L;
            this.ff006600660066f0066 = false;
            this.f0066006600660066f0066 = false;
            this.fffff00660066 = uuxuuuu.pp0070p0070ppp("A=", (char) (yllylll.r007200720072r00720072() ^ (-1146716799)), (char) (yllylll.r007200720072r00720072() ^ (-1146716890)), (char) (yllylll.r007200720072r00720072() ^ (-1146716792)));
        }

        public static /* synthetic */ boolean a00610061006100610061a(Builder builder) {
            if ((a00610061aa0061a0061() * (a00610061aa0061a0061() + aaaa00610061a0061)) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 17;
            }
            return builder.f00660066006600660066f;
        }

        public static /* synthetic */ boolean a006100610061a00610061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 58;
                aaa0061a0061a0061 = 56;
            }
            return builder.fff006600660066f;
        }

        public static /* synthetic */ IBehavioSecFieldCallback a00610061a0061a0061(Builder builder) {
            IBehavioSecFieldCallback iBehavioSecFieldCallback = builder.ffff0066f0066;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaaaaa00610061()) {
                a006100610061a0061a0061 = 22;
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return iBehavioSecFieldCallback;
        }

        public static /* synthetic */ boolean a00610061aa00610061(Builder builder) {
            boolean z = builder.f0066006600660066f0066;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = 41;
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return z;
        }

        public static int a00610061aa0061a0061() {
            return 89;
        }

        public static /* synthetic */ Set a00610061aaa0061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % aa00610061a0061a0061() != aaaaaa00610061()) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.ff0066fff0066;
        }

        public static /* synthetic */ IBehavioSecChunkConnector a0061a006100610061a(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.f0066ff0066f0066;
        }

        public static /* synthetic */ boolean a0061a0061a00610061(Builder builder) {
            boolean z = builder.ff0066f00660066f;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % aa00610061a0061a0061() != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 69;
            }
            return z;
        }

        public static int a0061a0061a0061a0061() {
            return 1;
        }

        public static /* synthetic */ boolean a0061aaa00610061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 86;
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.f006600660066f0066f;
        }

        public static /* synthetic */ int a0061aaaa0061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaaaaa00610061()) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 29;
            }
            return builder.ff0066006600660066f;
        }

        public static /* synthetic */ boolean aa0061006100610061a(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 2;
                aaa0061a0061a0061 = 0;
            }
            return builder.f0066f006600660066f;
        }

        public static /* synthetic */ long aa006100610061a0061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.fff00660066f0066;
        }

        public static /* synthetic */ boolean aa00610061a00610061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % aa00610061a0061a0061() != 0) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.f00660066f00660066f;
        }

        public static int aa00610061a0061a0061() {
            return 2;
        }

        public static /* synthetic */ Set aa00610061aa0061(Builder builder) {
            Set<String> set = builder.fff0066ff0066;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 64;
                aaa0061a0061a0061 = 2;
            }
            return set;
        }

        public static /* synthetic */ Set aa0061a0061a0061(Builder builder) {
            if ((a00610061aa0061a0061() * (a00610061aa0061a0061() + aaaa00610061a0061)) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 86;
            }
            return builder.f006600660066ff0066;
        }

        public static /* synthetic */ boolean aa0061aa00610061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaaaaa00610061()) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.ffff00660066f;
        }

        public static /* synthetic */ boolean aa0061aaa0061(Builder builder) {
            if ((a00610061aa0061a0061() * (a00610061aa0061a0061() + aaaa00610061a0061)) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 85;
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.f0066ffff0066;
        }

        public static /* synthetic */ IBehavioSecConnector aaa006100610061a(Builder builder) {
            IBehavioSecConnector iBehavioSecConnector = builder.f0066f0066f0066f;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = 53;
                aaa0061a0061a0061 = 37;
            }
            return iBehavioSecConnector;
        }

        public static /* synthetic */ Set aaa0061aa0061(Builder builder) {
            if (((a0061a0061a0061a0061() + a006100610061a0061a0061) * a006100610061a0061a0061) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 51;
                aaa0061a0061a0061 = 66;
            }
            return builder.f00660066fff0066;
        }

        public static /* synthetic */ boolean aaaa0061a0061(Builder builder) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaaaaa00610061()) {
                a006100610061a0061a0061 = 58;
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return builder.ff00660066f0066f;
        }

        public static /* synthetic */ int aaaaaa0061(Builder builder) {
            int i = builder.ffffff0066;
            if ((a00610061aa0061a0061() * (a00610061aa0061a0061() + aaaa00610061a0061)) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 46;
            }
            return i;
        }

        public static int aaaaaa00610061() {
            return 0;
        }

        @NonNull
        public BehavioSecCollector build() {
            BehavioSecCollector behavioSecCollector = new BehavioSecCollector(this);
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 95;
            }
            return behavioSecCollector;
        }

        @NonNull
        public Builder connector(IBehavioSecConnector iBehavioSecConnector) {
            if ((a00610061aa0061a0061() * (a0061a0061a0061a0061() + a00610061aa0061a0061())) % aa00610061a0061a0061() != aaa0061a0061a0061) {
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            this.f0066f0066f0066f = iBehavioSecConnector;
            return this;
        }

        @NonNull
        public Builder disableContextDataCollection() {
            this.fff006600660066f = false;
            int i = 4;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    a006100610061a0061a0061 = 51;
                    return this;
                }
            }
        }

        @NonNull
        public Builder disableDeviceDataCollection() {
            this.ff0066f00660066f = false;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = 99;
                aaa0061a0061a0061 = 7;
            }
            return this;
        }

        @NonNull
        public Builder disableFieldSuffix() {
            this.f00660066006600660066f = true;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 21;
                aaa0061a0061a0061 = 34;
            }
            return this;
        }

        @NonNull
        public Builder disableHierarchyChangesListener() {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 68;
            }
            this.ff00660066f0066f = false;
            return this;
        }

        @NonNull
        public Builder disableKeyboardDataCollection() {
            this.f006600660066f0066f = false;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 70;
                aaa0061a0061a0061 = 92;
            }
            return this;
        }

        @NonNull
        public Builder disableLocationCollection() {
            this.f00660066f00660066f = false;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % aa00610061a0061a0061() != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 7;
            }
            return this;
        }

        @NonNull
        public Builder disableTouchDataCollection() {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            this.ffff00660066f = false;
            return this;
        }

        @NonNull
        public Builder enableInjectJavascriptCollector() {
            this.f0066006600660066f0066 = true;
            return this;
        }

        @NonNull
        public Builder enableLegacyTouchData() {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 52;
                aaa0061a0061a0061 = 40;
            }
            this.f0066ff00660066f = true;
            return this;
        }

        @NonNull
        public Builder enableLogging() {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % aa00610061a0061a0061() != 0) {
                a006100610061a0061a0061 = 73;
                aaa0061a0061a0061 = 61;
            }
            this.ff0066006600660066f = 5;
            return this;
        }

        @NonNull
        public Builder enableRawData() {
            this.f0066f006600660066f = true;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 7;
            }
            return this;
        }

        @NonNull
        public Builder sendInChunks(IBehavioSecChunkConnector iBehavioSecChunkConnector, long j) {
            int i = 3;
            while (true) {
                try {
                    i /= 0;
                } catch (Exception unused) {
                    a006100610061a0061a0061 = 48;
                    this.f0066ff0066f0066 = iBehavioSecChunkConnector;
                    this.ff0066f0066f0066 = j;
                    this.f00660066f0066f0066 = -1L;
                    this.fff00660066f0066 = -1L;
                    return this;
                }
            }
        }

        @NonNull
        public Builder setAdvancedConfig(long j, boolean z) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 27;
            }
            this.f0066f00660066f0066 = j;
            this.ff006600660066f0066 = z;
            return this;
        }

        @NonNull
        public Builder setPiiDataCollectionMode(int i) {
            this.ffffff0066 = i;
            int i2 = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i2) * i2) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = 40;
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return this;
        }

        @NonNull
        public Builder useAnonymousMaskedCollection() {
            this.f0066ffff0066 = true;
            try {
                throw null;
            } catch (Exception unused) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                return this;
            }
        }

        @NonNull
        public Builder withFieldCallback(@NonNull IBehavioSecFieldCallback iBehavioSecFieldCallback) {
            if ((a00610061aa0061a0061() * (a00610061aa0061a0061() + aaaa00610061a0061)) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            this.ffff0066f0066 = iBehavioSecFieldCallback;
            return this;
        }

        @NonNull
        public Builder withIgnoredActivities(@NonNull Set<String> set) {
            this.f0066f0066ff0066 = Collections.unmodifiableSet(set);
            return this;
        }

        @NonNull
        public Builder withIgnoredFields(@NonNull Set<String> set) {
            this.f006600660066ff0066 = Collections.unmodifiableSet(set);
            return this;
        }

        @NonNull
        public Builder withIncludedActivities(@NonNull Set<String> set) {
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaaaaa00610061()) {
                a006100610061a0061a0061 = 62;
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            this.fff0066ff0066 = Collections.unmodifiableSet(set);
            return this;
        }

        @NonNull
        public Builder withMaskedFields(@NonNull Set<String> set) {
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(set);
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            this.f00660066fff0066 = setUnmodifiableSet;
            return this;
        }

        @NonNull
        public Builder withNormalFields(@NonNull Set<String> set) {
            this.ff0066fff0066 = Collections.unmodifiableSet(set);
            return this;
        }

        @NonNull
        public Builder withWebFieldIdentifierAttribute(@NonNull String str) {
            this.fffff00660066 = str;
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != 0) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = 87;
            }
            return this;
        }

        @NonNull
        public Builder withoutSendingActivities(@NonNull Set<String> set) {
            this.ff00660066ff0066 = Collections.unmodifiableSet(set);
            int i = a006100610061a0061a0061;
            if (((aaaa00610061a0061 + i) * i) % a0061aa00610061a0061 != aaa0061a0061a0061) {
                a006100610061a0061a0061 = a00610061aa0061a0061();
                aaa0061a0061a0061 = a00610061aa0061a0061();
            }
            return this;
        }

        @NonNull
        public Builder enableLogging(int i) {
            this.ff0066006600660066f = i;
            int i2 = 3;
            while (true) {
                try {
                    i2 /= 0;
                } catch (Exception unused) {
                    a006100610061a0061a0061 = 87;
                    return this;
                }
            }
        }

        @NonNull
        public Builder sendInChunks(IBehavioSecChunkConnector iBehavioSecChunkConnector, long j, long j2) {
            this.f0066ff0066f0066 = iBehavioSecChunkConnector;
            this.ff0066f0066f0066 = -1L;
            this.f00660066f0066f0066 = j;
            this.fff00660066f0066 = j2;
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused) {
                    a006100610061a0061a0061 = 95;
                    return this;
                }
            }
        }
    }

    private BehavioSecCollector(Builder builder) {
        this.ff0066ff0066f = Builder.aaa006100610061a(builder);
        this.f00660066ff0066f = Builder.a0061a006100610061a(builder);
        oddoodo oddoodoVar = new oddoodo(Builder.aaaa0061a0061(builder));
        this.fff0066f0066f = oddoodoVar;
        if (!Builder.a0061aaa00610061(builder)) {
            oddoodoVar.c0063cc00630063c();
        }
        if (!Builder.aa0061aa00610061(builder)) {
            oddoodoVar.c00630063c00630063c();
        }
        if (Builder.a00610061aa00610061(builder)) {
            oddoodoVar.ccc006300630063c();
        }
        if (builder.f0066ff00660066f) {
            oddoodoVar.c0063c006300630063c();
        }
        Builder.a0061a0061a00610061(builder);
        oddoodoVar.c006300630063c0063c();
        Builder.aa00610061a00610061(builder);
        oddoodoVar.cc0063c00630063c();
        Builder.a006100610061a00610061(builder);
        oddoodoVar.cc00630063c0063c();
        if (Builder.aa0061006100610061a(builder)) {
            oddoodoVar.cc0063006300630063c();
        }
        if (Builder.a00610061006100610061a(builder)) {
            oddoodoVar.cccc00630063c();
        }
        oddoodoVar.c00630063c0063c0063(Builder.aaaaaa0061(builder));
        oddoodoVar.cc0063c0063c0063(Builder.a0061aaaa0061(builder));
        if (Builder.aa0061aaa0061(builder)) {
            oddoodoVar.cc00630063cc0063();
        }
        oddoodoVar.ccc0063cc0063(Builder.a00610061aaa0061(builder));
        oddoodoVar.cc0063ccc0063(Builder.aaa0061aa0061(builder));
        oddoodoVar.ccc00630063c0063(builder.fffff00660066);
        oddoodoVar.c0063cccc0063(Builder.aa00610061aa0061(builder));
        oddoodoVar.c00630063006300630063c(builder.f0066f0066ff0066);
        oddoodoVar.c00630063ccc0063(builder.ff00660066ff0066);
        oddoodoVar.cccccc0063(Builder.aa0061a0061a0061(builder));
        oddoodoVar.c0063cc0063c0063(Builder.a00610061a0061a0061(builder));
        if (builder.ff0066f0066f0066 > 0) {
            oddoodoVar.c006300630063cc0063(builder.ff0066f0066f0066);
        } else if (builder.f00660066f0066f0066 > 0 && Builder.aa006100610061a0061(builder) > 0) {
            oddoodoVar.cccc0063c0063(builder.f00660066f0066f0066, Builder.aa006100610061a0061(builder));
        }
        oddoodoVar.c0063c0063cc0063(builder.f0066f00660066f0066, builder.ff006600660066f0066);
    }

    public static int a0061aaa0061a0061() {
        return 13;
    }

    @NonNull
    public static Builder builder() {
        int i = aa006100610061aa0061;
        if (((a0061006100610061aa0061 + i) * i) % aaaaa0061a0061 != aa0061aa0061a0061) {
            aa006100610061aa0061 = a0061aaa0061a0061();
            aa0061aa0061a0061 = 72;
        }
        return new Builder();
    }

    @Nullable
    public IBehavioSecChunkConnector getChunkConnector() {
        return this.f00660066ff0066f;
    }

    @NonNull
    public oddoodo getConfiguration() {
        oddoodo oddoodoVar = this.fff0066f0066f;
        int i = aa006100610061aa0061;
        if (((a0061006100610061aa0061 + i) * i) % aaaaa0061a0061 != 0) {
            aa006100610061aa0061 = a0061aaa0061a0061();
            a0061006100610061aa0061 = a0061aaa0061a0061();
        }
        return oddoodoVar;
    }

    @Nullable
    public IBehavioSecConnector getConnector() {
        int i = aa006100610061aa0061;
        if (((a0061006100610061aa0061 + i) * i) % aaaaa0061a0061 != aa0061aa0061a0061) {
            aa006100610061aa0061 = 52;
            aa0061aa0061a0061 = a0061aaa0061a0061();
        }
        return this.ff0066ff0066f;
    }
}
