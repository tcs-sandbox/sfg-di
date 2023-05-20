package guru.springframework.sfgdi.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior;

	public abstract void fly();
	public abstract void setFlyBehavior(final FlyBehavior flyBehavior);
}
