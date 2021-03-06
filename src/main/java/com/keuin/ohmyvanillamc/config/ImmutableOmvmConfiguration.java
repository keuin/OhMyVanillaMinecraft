package com.keuin.ohmyvanillamc.config;

public class ImmutableOmvmConfiguration extends OmvmConfiguration {

    public ImmutableOmvmConfiguration() {
        super();
    }

    public ImmutableOmvmConfiguration(OmvmConfiguration omvmConfiguration) {
        super(omvmConfiguration);
    }

    public ImmutableOmvmConfiguration(boolean fixEntityTrackerEntrySpamming, boolean disableFishSchooling,
                                      boolean disablePhantomSpawning, boolean disableWanderingTraderSpawning,
                                      boolean reintroduceLlamaItemDuplicating, boolean reintroduceZeroTickFarm,
                                      boolean enableStemForceRipening, boolean enableBambooForceRipening,
                                      boolean enableCactusForceRipening, boolean enableChorusFlowerForceRipening,
                                      boolean enableSugarCaneForceRipening) {
        super(fixEntityTrackerEntrySpamming, disableFishSchooling, disablePhantomSpawning,
                disableWanderingTraderSpawning, reintroduceLlamaItemDuplicating, reintroduceZeroTickFarm,
                enableStemForceRipening, enableBambooForceRipening, enableCactusForceRipening,
                enableChorusFlowerForceRipening, enableSugarCaneForceRipening);
    }

    @Override
    public void setFixEntityTrackerEntrySpamming(boolean fixEntityTrackerEntrySpamming) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDisableFishSchooling(boolean disableFishSchooling) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDisablePhantomSpawning(boolean disablePhantomSpawning) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDisableWanderingTraderSpawning(boolean disableWanderingTraderSpawning) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setReintroduceLlamaItemDuplicating(boolean reintroduceLlamaItemDuplicating) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setReintroduceZeroTickFarm(boolean reintroduceZeroTickFarm) {
        throw new UnsupportedOperationException();
    }
}
