package curseSequences.a09.sceneObjects;

import static cgtools.Vec3.*;
import cgtools.Vec3;
import curseSequences.a09.materials.Material;
import curseSequences.a09.rayTracing.Hit;
import curseSequences.a09.rayTracing.Ray;

public class Background implements Shape {

	public final Material material;
	
	public Background(Material material) {
		this.material = material;
	}

	@Override
	public Hit intersect(Ray ray) {
		double t = Double.POSITIVE_INFINITY;
		Vec3 hitPoint = add(ray.x0, multiply(t, ray.d));
		Vec3 normal = normalize(multiply(-1, ray.d));
		return new Hit(t, hitPoint, normal, material);
	}
}
