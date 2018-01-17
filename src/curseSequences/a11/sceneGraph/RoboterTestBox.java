package curseSequences.a11.sceneGraph;

import static cgtools.Vec3.*;

import cgtools.Mat4;
import curseSequences.a11.materials.ConstantTexture;
import curseSequences.a11.materials.EmittingMaterial;
import curseSequences.a11.rayTracing.Transformation;
import curseSequences.a11.sceneObjects.Cube;

public class RoboterTestBox extends Group {
	
	public RoboterTestBox(Mat4 transformation) {
		super(transformation);
	}

	@Override
	public void generateShapesList() {
		
//		// Testkonfiguration
////	|+Y
////	|____+X
////   /
////  /+z
		
		double roboterHeight = 13.15;
		double roboterWidth = 6.0;
		double roboterDepth = 3.4;

		geoObjectList.add(new Cube(vec3(0, 0, 0), vec3(roboterDepth, roboterHeight, roboterWidth), 
				new EmittingMaterial(new ConstantTexture(white))));
	}
}
