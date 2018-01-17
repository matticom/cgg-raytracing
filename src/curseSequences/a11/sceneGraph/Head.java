package curseSequences.a11.sceneGraph;


import static cgtools.Vec3.*;

import cgtools.Mat4;
import curseSequences.a11.materials.ConstantTexture;
import curseSequences.a11.materials.EmittingMaterial;
import curseSequences.a11.materials.GlassMaterial;
import curseSequences.a11.materials.PerfectDiffuseMaterial;
import curseSequences.a11.rayTracing.Transformation;
import curseSequences.a11.sceneObjects.Cone;
import curseSequences.a11.sceneObjects.Sphere;


public class Head extends Group {

	public Head(Mat4 transformation) {
		super(transformation);
	}

	@Override
	public void generateShapesList() {
		
//		// Testkonfiguration
////	|+Y
////	|____+X
////   /
////  /+z
		
		// Hals
		geoObjectList.add(new Cone(vec3(0, 1, 0), 1, new PerfectDiffuseMaterial(new ConstantTexture(black))));

		// Kopf
		geoObjectList.add(new Sphere(vec3(0, 1.8, 0), 1.6, new GlassMaterial(new ConstantTexture(aqua), 1.5)));

		// Augen
		double eyeDistance = 0.7;
		geoObjectList.add(new Sphere(vec3(1.3, 1.7, eyeDistance), 0.3, new EmittingMaterial(new ConstantTexture(light_mint))));
		geoObjectList.add(new Sphere(vec3(1.3, 1.7, -eyeDistance), 0.3, new EmittingMaterial(new ConstantTexture(light_mint))));
	}

}
